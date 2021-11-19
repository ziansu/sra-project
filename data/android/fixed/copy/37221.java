@java.lang.Override
public com.laneve.asp.ASMAnalysis.asmTypes.expressions.IExpression clone() {
    com.laneve.asp.ASMAnalysis.asmTypes.expressions.IExpression a = cloneExpression();
    a.name = name;
    return a;
}