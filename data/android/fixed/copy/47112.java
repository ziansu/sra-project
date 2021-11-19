private void setTail(ChainedEntry later) {
    getLast().setNext(later);
    later.setPrev(later);
    setLast(later);
}