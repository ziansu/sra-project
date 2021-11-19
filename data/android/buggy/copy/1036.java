public void error(java.lang.String fmt, java.lang.Object... varArgs) throws java.lang.Exception {
    throw new havabol.ParserException(scan.currentToken.iSourceLineNr, java.lang.String.format(fmt, varArgs), scan.sourceFileNm);
}