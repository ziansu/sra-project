public java.lang.String[] getPossibleRepetitions() {
    java.util.Set<java.lang.Integer> values = new java.util.HashSet<>(this.transitionsCount.values());
    return values.toArray(new java.lang.String[values.size()]);
}