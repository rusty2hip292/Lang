
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
	
	public static final String[] extensions = {".src"};
	public static boolean quiet = false;
	
	public static void panic(String fmt, Object... args) {
		Exception e;
		try {
			throw new Exception();
		}catch(Exception temp) {
			e = temp;
		}
		System.err.println(String.format(String.format("panic: %s", fmt), args));
		e.printStackTrace();
		System.exit(-1);
	}
	public static void debug(String fmt, Object... args) {
		if(!quiet) {
			System.out.printf(fmt, args);
		}
	}
	
	public static boolean hasCorrectExtension(String s) {
		for(String ext : extensions) {
			if(s.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
	private static void addSource(String filename, List<File> files, boolean careAboutExtension) {
		File f = new File(filename);
		if(f.exists()) {
			if(f.isDirectory()) {
				for(String f2 : f.list()) {
					addSource(f.getPath() + "\\" + f2, files, true);
				}
			}else {
				if(hasCorrectExtension(filename)) {
					//Reader.debug("fetching " + filename + "\n");
					files.add(f);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		if(args.length < 1) {
			panic("No source files, fatal error");
		}
		
		File main = new File(args[0]);
		if(!main.exists()) {
			panic("Primary source file does not exist, fatal error");
		}else if(main.isDirectory()) {
			panic("Primary source file is a directory, fatal error");
		}
		List<File> sourceFiles = new ArrayList<File>(10 * args.length);
		for(int i = 1; i < args.length; i++) {
			addSource(args[i], sourceFiles, false);
		}
		StringBuffer sb = new StringBuffer();
		sb.append(read(main));
		sb.append("\nexit(0)\n\n"); // end of main program, do not run into the other source files
		for(File f : sourceFiles) {
			sb.append(read(f));
		}
		System.out.println(sb.toString()); // pipe to antlr
	}
	
	public static String read(File f) {
		try {
			Scanner s = new Scanner(f);
			StringBuffer sb = new StringBuffer();
			while(s.hasNextLine()) {
				sb.append(s.nextLine());
				sb.append("\n");
			}
			s.close();
			return sb.toString();
		}catch(Exception e) {
			Reader.panic("Could not read from file %s, fatal error", f.getName());
		}
		return null;
	}
}
