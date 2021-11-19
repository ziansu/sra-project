private boolean isEscaped(java.lang.String text, int pos) {
    if (pos <= 0) {
        return false;
    }
    return (text.charAt(pos)) == '\\';
}