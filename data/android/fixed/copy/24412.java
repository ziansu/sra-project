public static java.lang.String getSubString(java.lang.CharSequence str, int offsetStart, int offsetEnd) {
    if ((str.length()) == 0)
        return null;
    
    return str.subSequence(offsetStart, offsetEnd).toString();
}