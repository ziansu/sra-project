public long getRecordPointer() {
    final long compressedAddress = (packedRecordPointer) & (org.apache.spark.shuffle.unsafe.PackedRecordPointer.MASK_LONG_LOWER_40_BITS);
    final long pageNumber = (compressedAddress << 24) & (org.apache.spark.shuffle.unsafe.PackedRecordPointer.MASK_LONG_UPPER_13_BITS);
    final long offsetInPage = compressedAddress & (org.apache.spark.shuffle.unsafe.PackedRecordPointer.MASK_LONG_LOWER_27_BITS);
    return pageNumber | offsetInPage;
}