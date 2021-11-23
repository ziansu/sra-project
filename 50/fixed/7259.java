private void addSleeper(final long identifier, final org.apache.reef.util.ComplexCondition call) {
    if ((sleeperMap.put(identifier, call)) != null) {
        throw new java.lang.RuntimeException(java.lang.String.format("Duplicate identifier [%d] in sleeper map", identifier));
    }
}