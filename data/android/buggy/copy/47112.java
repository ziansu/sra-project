public void setTail(ChainedEntry later) {
    getLast().setNext(later);
    later.setPrev(getLast());
    setLast(later);
}