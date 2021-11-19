private java.util.Set<java.lang.String> parseFeatureSet(java.lang.String features) {
    java.lang.String[] split = features.split(" ");
    return new java.util.HashSet<java.lang.String>(java.util.Arrays.asList(split));
}