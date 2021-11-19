private void buildUndeclaredIdentifierError(dataStructures.Token token) {
    java.lang.String error = ((("ERROR: [Line : " + (token.getLineNum())) + "] undeclared identifier <") + (token.getValue())) + ">";
    this.errorMessages.add(error);
}