public java.lang.String getDefinition() {
    java.lang.String stringDefReturn = "";
    for (Definition definition : mDefinitions) {
        stringDefReturn += (definition.getDefinition()) + "\n";
    }
    return stringDefReturn;
}