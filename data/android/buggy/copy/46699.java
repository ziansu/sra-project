public org.apache.lucene.search.grouping.term.TermMemCollector.FloatInt setCompound(long compound) {
    this.floatVal = java.lang.Float.intBitsToFloat(((int) (compound >>> 32)));
    this.intVal = ((int) (compound));
    return this;
}