@java.lang.Override
public void fillSymbolTable(org.uva.taxfree.model.environment.SymbolTable symbolTable) {
    symbolTable.addDeclaration(this);
    symbolTable.addCalculation(this);
    symbolTable.addExpression(mExpression);
}