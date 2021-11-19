private static boolean isIndexed(java.lang.String fieldName) {
    return (fieldName != null) && (fieldName.matches(".+\\[\\d+\\]"));
}