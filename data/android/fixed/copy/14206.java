public java.lang.Long getMemoryMB() {
    if ((mem) == null) {
        mem = 0.0F;
    }
    java.lang.Long memSizeGBLng = mem.longValue();
    java.lang.Long memSizeMB = memSizeGBLng * 1024;
    return memSizeMB;
}