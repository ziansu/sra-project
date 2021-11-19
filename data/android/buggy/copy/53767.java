@java.lang.Override
public ashc.grammar.TypeI getExprType() {
    return ashc.grammar.Semantics.getPrecedentType(exprTrue.getExprType(), exprFalse.getExprType());
}