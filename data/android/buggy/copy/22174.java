public java.util.Set<java.lang.String> extractKeyWords(java.lang.String key, com.google.gson.JsonElement jsonElement) {
    thesis.nlp.keywords.KeywordsExtraction.check(key, jsonElement);
    return thesis.nlp.keywords.KeywordsExtraction.listKeywords;
}