void putString(java.lang.CharSequence str) {
    for (int s = 0; s < (str.length()); s++) {
        putChar(str.charAt(s), 0, false);
    }
}