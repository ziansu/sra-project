public void addToEnv(slp.Formals formals) {
    slp.SymbolEntry symbolEntry = addDeclaration(slp.Validator.validateType(formals.type, this), formals.name, formals.line);
    symbolEntry.setIsInitialized(true);
}