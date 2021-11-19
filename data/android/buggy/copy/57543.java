public boolean seen(long msgId) {
    boolean seen = (msgId <= (highestContiguousMsgId)) || (nonContiguousMsgIds.contains(msgId));
    tryReconcile();
    return seen;
}