import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenizer {

	public static String toString(File file) {
		try {
			Scanner s = new Scanner(file);
			StringBuffer sb = new StringBuffer();
			while(s.hasNextLine()) {
				sb.append(s.nextLine());
				sb.append("\n");
			}
			s.close();
			return sb.toString();
		} catch (FileNotFoundException e) {
			Compiler.panic(e.getMessage());
		}
		return null;
	}
	public static ArrayList<String> toStrings(ArrayList<File> files) {
		ArrayList<String> strings = new ArrayList<String>(files.size());
		for(File f : files) {
			strings.add(toString(f));
		}
		return strings;
	}
	
	private String program;
	public Tokenizer(String program) {
		this.program = program;
	}
	
	public ArrayList<Token> tokenize() {
		String temp = this.program;
		ArrayList<Token> tokens = new ArrayList<Token>(1000);
		while(temp != null && !temp.equals("")) {
			temp = Token.match(temp, tokens);
		}
		return tokens;
	}
}
