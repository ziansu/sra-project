public void fail(backtype.storm.tuple.Tuple tuple) {
    java.lang.Object id = tuple.getValue(0);
    synchronized(_tracked) {
        (_tracked.get(id).receivedTuples)++;
    }
    checkFinishId(tuple);
    _delegate.fail(tuple);
}