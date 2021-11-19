static void processVariableDecl(wci.frontend.Token token, wci.frontend.SymTabEntry variableId) throws wci.frontend.ParseException {
    variableId.setDefinition(DefinitionImpl.VARIABLE);
    variableId.appendLineNumber(token.beginLine);
}