@java.lang.Override
public java.lang.String apply(java.lang.String pCode) {
    if ((pCode.startsWith("(")) && (pCode.endsWith(")"))) {
        return pCode;
    }
    return ("(" + pCode) + ")";
}