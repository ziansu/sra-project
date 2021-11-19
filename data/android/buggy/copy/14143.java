public static void insertSP(int threadHashCode, int sp) {
    SpMap.ThreadSequenceMap.put(threadHashCode, sp);
}