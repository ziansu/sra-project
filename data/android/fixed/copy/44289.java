public static java.lang.String removePrefix(java.lang.String str, java.lang.String rmStr) {
    if (str.startsWith(rmStr)) {
        return str.substring(rmStr.length());
    }
    return str;
}