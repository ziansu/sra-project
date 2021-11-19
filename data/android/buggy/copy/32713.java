public java.util.List<java.lang.String> suggest(java.lang.String query) throws java.io.IOException {
    return java.util.Arrays.asList(spellChecker.suggestSimilar(query.toLowerCase(), 5));
}