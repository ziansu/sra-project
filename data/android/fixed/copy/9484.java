private static java.lang.String getLastNumb(java.lang.String str) {
    if (str.matches((".*" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber))))
        return str.replaceAll(((".*?" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber)) + "$"), "$1");
    
    return "";
}