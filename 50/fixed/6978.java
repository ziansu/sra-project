private java.lang.String detectLanguage(org.jsoup.nodes.Document document) throws java.io.IOException {
    org.apache.tika.language.LanguageIdentifier identifier = new org.apache.tika.language.LanguageIdentifier(document.title());
    return identifier.getLanguage();
}