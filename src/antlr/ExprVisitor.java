// Generated from Expr.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FeatureDeclaration}
	 * labeled alternative in {@link ExprParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureDeclaration(ExprParser.FeatureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FeatureHeader}
	 * labeled alternative in {@link ExprParser#featHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureHeader(ExprParser.FeatureHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FeatureBody}
	 * labeled alternative in {@link ExprParser#featBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureBody(ExprParser.FeatureBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockBodyDeclaration}
	 * labeled alternative in {@link ExprParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBodyDeclaration(ExprParser.BlockBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#scenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenarioDeclaration(ExprParser.ScenarioDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutlineScenarioDeclaration}
	 * labeled alternative in {@link ExprParser#outlineScenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutlineScenarioDeclaration(ExprParser.OutlineScenarioDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RestOfLineDeclaration}
	 * labeled alternative in {@link ExprParser#restOfLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TitleDeclaration}
	 * labeled alternative in {@link ExprParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleDeclaration(ExprParser.TitleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordDeclaration}
	 * labeled alternative in {@link ExprParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordDeclaration(ExprParser.WordDeclarationContext ctx);
}