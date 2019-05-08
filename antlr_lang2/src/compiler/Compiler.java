package compiler;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Compiler {
/*	
	public static List<LangListener> listeners = new LinkedList<LangListener>();
	static {
		listeners.add(new TypeExtractor());
		listeners.add(new VariableAndFunctionExtractor());
	}
	
	private static LangParser makeParser(String filename) throws Exception {
		return new LangParser(new CommonTokenStream(new LangLexer(new ANTLRFileStream(filename))));
	}
	private static void handle(List<File> files) {
		for(LangListener listener : listeners) {
			for(File file : files) {
				try {
					handle(file.getAbsolutePath(), listener);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	private static String currentFileName = "";
	public static String currentFile() {
		return currentFileName;
	}
	private static void handle(String filename, LangListener listener) throws Exception {
		currentFileName = filename;
		LangParser parser = makeParser(filename);
		parser.addParseListener(listener);
		parser.program().enterRule(null);
	}
	
	private static List<String> handleFlags(List<String> args) {
		return args;
	}
	
	private static String main;
	public static String mainProgram() {
		return main;
	}
	public static void main(String[] args) {
		if(args.length > 0) {
			main = args[0];
		}
		List<String> list = new LinkedList<String>();
		for(String s : args) {
			list.add(s);
		}
		args = handleFlags(list).toArray(args);
		List<File> files = Reader.resolve(args);
		handle(files);
	}*/
}
