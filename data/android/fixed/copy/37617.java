private void buildUndeclaredIdentifierError(dataStructures.Token token) {
    java.lang.String error = ((("ERROR: [Line : " + (token.getLineNum())) + "] undeclared identifier <") + (token.getValue())) + ">";
    errorMessages.add(error);
}