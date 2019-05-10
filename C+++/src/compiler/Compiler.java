package compiler;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr.*;

public class Compiler {
	
	public static List<CplusplusplusListener> listeners = new LinkedList<CplusplusplusListener>();
	static {
		listeners.add(new listeners.EverythingListener());
	}
	
	private static CplusplusplusParser makeParser(String filename) throws Exception {
		return new CplusplusplusParser(new CommonTokenStream(new CplusplusplusLexer(new ANTLRFileStream(filename))));
	}
	private static void handle(List<File> files) {
		for(CplusplusplusListener listener : listeners) {
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
	private static void handle(String filename, CplusplusplusListener listener) throws Exception {
		currentFileName = filename;
		CplusplusplusParser parser = makeParser(filename);
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
		if(args.length <= 0) {
			return;
		}
		List<String> list = new LinkedList<String>();
		for(String s : args) {
			list.add(s);
		}
		args = handleFlags(list).toArray(args);
		List<File> files = Reader.resolve(args);
		main = files.get(0).getAbsolutePath();
		handle(files);
	}
}
