public void mark(final int textNo) {
    final boolean needServerMark;
    synchronized(mMarked) {
        needServerMark = mMarked.add(textNo);
    }
    if (needServerMark) {
        mToMark.add(textNo);
    }
}