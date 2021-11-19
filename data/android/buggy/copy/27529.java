@java.lang.SuppressWarnings(value = "rawtypes")
private boolean sameType(java.lang.Object flowSet) {
    return (flowSet instanceof soot.toolkits.scalar.ArrayPackedSet) && ((((soot.toolkits.scalar.ArrayPackedSet) (flowSet)).map) == (map));
}