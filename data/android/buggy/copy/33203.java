public java.lang.Object VisitFunctionCallStatement(ASTFunctionCallStatement statement) {
    for (i = 0; (i) < (functioncall.size()); (i)++)
        functioncall.elementAt(i).Accept(this);
    
    return null;
}