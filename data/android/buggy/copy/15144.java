public void ackOffset(java.util.List<java.lang.Long> offsetList, com.ctrip.hermes.storage.message.Ack ack) {
    try {
        putCleanTask();
        service.submit(ackOffsetRunnable(offsetList, ack));
    } catch (java.lang.InterruptedException e) {
        log.info("NewOffsetBitmap: ackOffset() is Interrupted!");
    }
}