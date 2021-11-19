public java.util.LinkedHashSet<java.lang.Integer> getPostings(java.lang.String term) {
    return index.get(term).getPostings();
}