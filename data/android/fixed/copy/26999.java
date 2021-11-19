public void ackOffset(com.ctrip.hermes.storage.range.NewOffsetBitmap bitmap, com.ctrip.hermes.storage.range.OffsetRecord record) {
    java.util.List<java.lang.Long> offsets = offsetToLong(record.getToBeDone());
    bitmap.ackOffset(offsets.iterator(), record.getAck());
}