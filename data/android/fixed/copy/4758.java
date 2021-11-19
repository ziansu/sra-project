private void increment(long startLabel, long relationshipType, long endLabel) {
    long index = arrayIndex(startLabel, relationshipType, endLabel);
    counts.set(index, ((counts.get(index)) + 1));
}