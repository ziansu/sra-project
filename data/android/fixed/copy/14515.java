public SemanticAnalysis.ICTypeInfo validate(java.lang.String receivedClassName) throws SemanticAnalysis.SemanticAnalysisException {
    if (SemanticAnalysis.SymbolTable.doesClassExist(className))
        return new SemanticAnalysis.ICTypeInfo(className, 0);
    else
        return null;
    
}