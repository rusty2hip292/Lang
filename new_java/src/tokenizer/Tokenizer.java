package tokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import compiler.Compiler;

public class Tokenizer implements Iterator<Token>, Iterable<Token> {

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
	
	private final String program;
	private String remaining;
	private final List<Token> tokenized;
	private int index = 0;
	public Tokenizer(String program) {
		this.program = program;
		this.remaining = this.program;
		this.tokenized = this.tokenize();
	}
	
	public List<Token> tokenize() {
		List<Token> tokens = new LinkedList<Token>();
		while(remaining != null && !remaining.equals("")) {
			remaining = Token.match(remaining, tokens);
		}
		return tokens;
	}
	
	public boolean hasNext() {
		return index < tokenized.size();
	}
	public Token next() {
		return tokenized.get(index++);
	}
	
	public Iterator<Token> iterator() {
		return this.tokenized.iterator();
	}
}
