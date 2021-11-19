public void insert(int value) {
    verifyNIL();
    BinomialHeap.BinomialNode x = new BinomialHeap.BinomialNode(value);
    insert(x);
}