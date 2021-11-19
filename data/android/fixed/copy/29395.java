public boolean contains(final java.lang.String word) {
    if ((word.length()) == 1) {
        return true;
    }
    return words.contains(word.replace('\u2019', '\'').toLowerCase(java.util.Locale.ENGLISH));
}