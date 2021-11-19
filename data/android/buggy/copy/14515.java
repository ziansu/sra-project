public SemanticAnalysis.ICTypeInfo validate(java.lang.String receivedClassName) throws SemanticAnalysis.SemanticAnalysisException {
    if (SemanticAnalysis.SymbolTable.doesClassExist(receivedClassName))
        return new SemanticAnalysis.ICTypeInfo(receivedClassName, 0);
    else
        return null;
    
}