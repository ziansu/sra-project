private void recycle(final org.apache.reef.util.ComplexCondition call) {
    if (null != call) {
        freeQueue.add(call);
    }
}