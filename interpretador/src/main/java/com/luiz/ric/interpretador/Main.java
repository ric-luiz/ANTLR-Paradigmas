
package com.luiz.ric.interpretador;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "ric";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		ricardoLexer lexer = new ricardoLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ricardoParser parser = new ricardoParser(tokens);

		ricardoParser.ProgramContext tree = parser.program();

		ricardoCustomVisitor visitor = new ricardoCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
