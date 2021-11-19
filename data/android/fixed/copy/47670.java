public static java.lang.String getToken(java.lang.String line, mesquite.lib.MesquiteInteger startChar, java.lang.String whitespaceString, java.lang.String punctuationString) {
    return mesquite.lib.ParseUtil.getToken(line, startChar, whitespaceString, punctuationString, true);
}