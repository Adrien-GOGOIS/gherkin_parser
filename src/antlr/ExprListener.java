// Generated from Expr.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FeatureDeclaration}
	 * labeled alternative in {@link ExprParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeatureDeclaration(ExprParser.FeatureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FeatureDeclaration}
	 * labeled alternative in {@link ExprParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeatureDeclaration(ExprParser.FeatureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FeatureHeader}
	 * labeled alternative in {@link ExprParser#featHeader}.
	 * @param ctx the parse tree
	 */
	void enterFeatureHeader(ExprParser.FeatureHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FeatureHeader}
	 * labeled alternative in {@link ExprParser#featHeader}.
	 * @param ctx the parse tree
	 */
	void exitFeatureHeader(ExprParser.FeatureHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FeatureBody}
	 * labeled alternative in {@link ExprParser#featBody}.
	 * @param ctx the parse tree
	 */
	void enterFeatureBody(ExprParser.FeatureBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FeatureBody}
	 * labeled alternative in {@link ExprParser#featBody}.
	 * @param ctx the parse tree
	 */
	void exitFeatureBody(ExprParser.FeatureBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockBodyDeclaration}
	 * labeled alternative in {@link ExprParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBodyDeclaration(ExprParser.BlockBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockBodyDeclaration}
	 * labeled alternative in {@link ExprParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBodyDeclaration(ExprParser.BlockBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#scenario}.
	 * @param ctx the parse tree
	 */
	void enterScenarioDeclaration(ExprParser.ScenarioDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#scenario}.
	 * @param ctx the parse tree
	 */
	void exitScenarioDeclaration(ExprParser.ScenarioDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutlineScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#outlineScenario}.
	 * @param ctx the parse tree
	 */
	void enterOutlineScenarioDeclaration(ExprParser.OutlineScenarioDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutlineScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#outlineScenario}.
	 * @param ctx the parse tree
	 */
	void exitOutlineScenarioDeclaration(ExprParser.OutlineScenarioDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RestOfLineDeclaration}
	 * labeled alternative in {@link ExprParser#restOfLine}.
	 * @param ctx the parse tree
	 */
	void enterRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RestOfLineDeclaration}
	 * labeled alternative in {@link ExprParser#restOfLine}.
	 * @param ctx the parse tree
	 */
	void exitRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TitleDeclaration}
	 * labeled alternative in {@link ExprParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitleDeclaration(ExprParser.TitleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TitleDeclaration}
	 * labeled alternative in {@link ExprParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitleDeclaration(ExprParser.TitleDeclarationContext ctx);
}