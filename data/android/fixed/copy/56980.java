private java.lang.String convertStringForCsv(java.lang.String inString) {
    java.lang.String retVal = "";
    if (null != inString) {
        retVal = inString.replace(',', ';');
        retVal = retVal.replace('\n', ' ');
    }
    return retVal;
}