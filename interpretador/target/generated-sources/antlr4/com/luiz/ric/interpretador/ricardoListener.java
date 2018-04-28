// Generated from ricardo.g4 by ANTLR 4.4
package com.luiz.ric.interpretador;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ricardoParser}.
 */
public interface ricardoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ricardoParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull ricardoParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull ricardoParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#sentece}.
	 * @param ctx the parse tree
	 */
	void enterSentece(@NotNull ricardoParser.SenteceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#sentece}.
	 * @param ctx the parse tree
	 */
	void exitSentece(@NotNull ricardoParser.SenteceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull ricardoParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull ricardoParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ricardoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ricardoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ricardoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull ricardoParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ricardoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull ricardoParser.Var_declContext ctx);
}