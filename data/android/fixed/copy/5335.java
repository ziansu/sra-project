public static int getWordCount(java.lang.String l) {
    if ((l == null) || ((l.length()) == 0)) {
        return 0;
    }
    return com.quollwriter.text.TextUtilities.getAsWords(l).size();
}