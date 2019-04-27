import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Compiler {

	// contains program source code for each file we are compiling
	private static ArrayList<Code> program = new ArrayList<Code>();
	
	/*
	 * starts the parse process for the file specified by the string name
	 * 
	 * should be used to parse files given by command line arguments
	 * as well as if we decide to support includes/imports
	 */
	public static void addToSourceFiles(String filename) throws Exception {
		ArrayList<String> lines;
		File f = Paths.get(filename).toFile();
		
		/*
		 * recursively add directories
		 * 
		 * this will make it so that code within the same directory structure can
		 * be automatically "imported" at compile time by compiling the parent directory,
		 * rather than having to manually import/include each file
		 */
		if(f.isDirectory()) {
			for(String file : f.list()) {
				addToSourceFiles(f.getName() + "/" + file);
			}
			return;
		}
		
		lines = Compiler.lines(f);
		Code c = new Code(lines);
		program.add(c);
		
		/*
		 * this does nothing atm, but will be used to handle import statements
		 * 
		 * imports handled this way will be global, so they only need to be imported once in the whole project
		 * name conflicts are not handled right now
		 */
		AddDependencies.resolve(c);
	}
	
	public static void main(String[] args) {
		
		/*
		 * these are the files we are using to build our program
		 */
		for(String filename : args) {
			try {
				addToSourceFiles(filename);
			}catch(Exception e) {
				System.err.printf("Could not open file or directory \"%s\", fatal error\n", filename);
				e.printStackTrace();
				return;
			}
		}
		
		/*
		 * look for all of the global types in the source code
		 * 
		 * also would be a good time to scan for function definitions
		 */
		for(Code c : program) {
			TypeExtractor.extractTypes(c);
		}
	}
	
	/*
	 * reads the contents of the given file into a list of lines
	 */
	private static ArrayList<String> lines(File f) throws Exception {
		f.setReadable(true);
		Scanner s = new Scanner(f);
		ArrayList<String> lines = new ArrayList<String>(1000);
		while(s.hasNextLine()) {
			lines.add(s.nextLine());
		}
		s.close();
		return lines;
	}
	
	/*
	 * concats the lines of the program into a single string
	 */
	public static String toMassiveString(ArrayList<String> code) {
		StringBuffer sb = new StringBuffer();
		for(String s : code) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}
}
