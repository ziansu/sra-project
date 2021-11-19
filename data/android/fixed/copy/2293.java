public void skipTo(java.lang.String stmt, java.lang.String terminatingStr) throws java.lang.Exception {
    while (!(scan.currentToken.tokenStr.equals(stmt))) {
        scan.getNext();
    } 
}