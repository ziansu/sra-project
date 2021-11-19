public static java.lang.String truncate(java.lang.String str, int length) {
    return (str == null) || ((str.length()) <= length) ? str : str.substring(0, length);
}