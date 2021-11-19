public long getRecordPointer() {
    final long pageNumber = ((packedRecordPointer) << 24) & (org.apache.spark.shuffle.unsafe.PackedRecordPointer.MASK_LONG_UPPER_13_BITS);
    final long offsetInPage = (packedRecordPointer) & (org.apache.spark.shuffle.unsafe.PackedRecordPointer.MASK_LONG_LOWER_27_BITS);
    return pageNumber | offsetInPage;
}