public java.util.List<com.xdrop.fuzzywuzzy.model.ExtractedResult> extractWithoutOrder(java.lang.String query, java.util.Collection<java.lang.String> choices, com.xdrop.fuzzywuzzy.Applicable func) {
    com.xdrop.fuzzywuzzy.Extractor extractor = new com.xdrop.fuzzywuzzy.Extractor();
    return extractor.extractBests(query, choices, func);
}