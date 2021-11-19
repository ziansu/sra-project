public void mark(final int textNo) {
    final boolean needServerMark = (mMarked.put(textNo, textNo)) == null;
    if (needServerMark) {
        synchronized(mToMark) {
            mToMark.add(textNo);
        }
    }
}