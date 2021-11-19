public static java.lang.String getSubString(java.lang.CharSequence text, int offsetStart, int offsetEnd) {
    if ((text.length()) == 0)
        return null;
    
    return text.subSequence(offsetStart, offsetEnd).toString();
}