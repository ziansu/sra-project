public void setPredicate(java.lang.String uri) {
    if (uri != null) {
        predicate = defaultModel.createProperty(uri);
    }
}