// Generated from D:/IntelliJProjects/PL0-Compiler/resource\Pl0.g4 by ANTLR 4.7

package com.enihsyou.compiler.pl0.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pl0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface Pl0Visitor<T> extends ParseTreeVisitor<T> {

    /**
     * Visit a parse tree produced by {@link Pl0Parser#program}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitProgram(Pl0Parser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#block}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitBlock(Pl0Parser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#const_declaration}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitConst_declaration(Pl0Parser.Const_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#var_declaration}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitVar_declaration(Pl0Parser.Var_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#procedure_declaration}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitProcedure_declaration(Pl0Parser.Procedure_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#const_assigment}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitConst_assigment(Pl0Parser.Const_assigmentContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#statement}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitStatement(Pl0Parser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#condition}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitCondition(Pl0Parser.ConditionContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#relation_op}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitRelation_op(Pl0Parser.Relation_opContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#expression}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitExpression(Pl0Parser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#term}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitTerm(Pl0Parser.TermContext ctx);

    /**
     * Visit a parse tree produced by {@link Pl0Parser#factor}.
     *
     * @param ctx the parse tree
     *
     * @return the visitor result
     */
    T visitFactor(Pl0Parser.FactorContext ctx);
}
