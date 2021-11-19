public static void clearExtensionals() {
    for (java.lang.String predicate : conceptualhierarchy.ActualData.predicateExtensionals.keySet()) {
        conceptualhierarchy.ActualData.predicateExtensionals.get(predicate).clear();
    }
}