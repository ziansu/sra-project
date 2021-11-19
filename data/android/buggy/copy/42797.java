public boolean isWrapAround() {
    return ((keyRange) instanceof org.apache.cassandra.db.Range) && (((org.apache.cassandra.db.Range) (keyRange)).isWrapAround());
}