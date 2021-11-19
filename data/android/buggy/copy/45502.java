public static long arrayGet(long[] array, int index) {
    return com.questdb.misc.Unsafe.getUnsafe().getLong(array, ((com.questdb.misc.Unsafe.LONG_OFFSET) + (index << (com.questdb.misc.Unsafe.LONG_SCALE))));
}