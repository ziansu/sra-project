private static final void putLong(java.lang.Object obj, long off, long val) {
    if (org.joml.MemUtil.MemUtilUnsafe.HAS_putOrderedLong)
        org.joml.MemUtil.MemUtilUnsafe.UNSAFE.putOrderedLong(obj, off, val);
    else
        org.joml.MemUtil.MemUtilUnsafe.UNSAFE.putLong(obj, off, val);
    
}