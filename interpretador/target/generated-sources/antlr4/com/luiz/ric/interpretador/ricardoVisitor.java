// Generated from com\luiz\ric\interpretador\ricardo.g4 by ANTLR 4.5.1
package com.luiz.ric.interpretador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ricardoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ricardoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ricardoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ricardoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ricardoParser#sentece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentece(ricardoParser.SenteceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ricardoParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(ricardoParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ricardoParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(ricardoParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ricardoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(ricardoParser.PrintlnContext ctx);
}