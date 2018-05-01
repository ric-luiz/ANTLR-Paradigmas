// Generated from com\luiz\ric\interpretador\ricardo.g4 by ANTLR 4.5.3
package com.luiz.ric.interpretador;

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ricardoParser}.
 */
public interface ricardoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ricardoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ricardoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ricardoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#sentece}.
	 * @param ctx the parse tree
	 */
	void enterSentece(ricardoParser.SenteceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#sentece}.
	 * @param ctx the parse tree
	 */
	void exitSentece(ricardoParser.SenteceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(ricardoParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(ricardoParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(ricardoParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(ricardoParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ricardoParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ricardoParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ricardoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ricardoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ricardoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ricardoParser.TermContext ctx);
}