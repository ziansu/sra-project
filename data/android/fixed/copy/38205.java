@java.lang.Override
public boolean visitBinaryExpressionWithType(@org.jetbrains.annotations.NotNull
com.android.tools.klint.checks.UBinaryExpressionWithType node) {
    visitTypeCastExpression(node);
    return super.visitBinaryExpressionWithType(node);
}