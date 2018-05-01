// Generated from com\luiz\ric\interpretador\ricardo.g4 by ANTLR 4.5.3
package com.luiz.ric.interpretador;

    import java.util.Map;
    import java.util.HashMap;

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
	/**
	 * Visit a parse tree produced by {@link ricardoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ricardoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ricardoParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ricardoParser.TermContext ctx);
}