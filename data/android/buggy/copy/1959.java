private java.lang.String getFirstNumb(java.lang.String str) {
    java.lang.String[] strA = str.split(("(?<!^|E)" + (com.llamacorp.equate.Expression.regexAnyValidOperator)));
    return strA[0];
}