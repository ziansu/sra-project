@java.lang.SuppressWarnings(value = "deprecation")
private static long getSize(android.os.StatFs statFs) {
    int blockSize = statFs.getBlockSize();
    int availableBlocks = statFs.getAvailableBlocks();
    return (blockSize * availableBlocks) / (1024 * 1024);
}