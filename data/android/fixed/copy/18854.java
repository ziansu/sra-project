public int getNextIndex(int nextAction) {
    return (repeat.getCounter()) < 0 ? nextAction + 1 : repeat.getStartIndex();
}