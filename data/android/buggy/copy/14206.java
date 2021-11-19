public java.lang.Long getMemoryMB() {
    java.lang.Long memSizeGBLng = mem.longValue();
    java.lang.Long memSizeMB = memSizeGBLng * 1024;
    return memSizeMB;
}