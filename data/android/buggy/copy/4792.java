public java.lang.Double getRelevance(java.lang.String url) {
    java.lang.Double relevance = map.get(url);
    return relevance == null ? 0 : relevance;
}