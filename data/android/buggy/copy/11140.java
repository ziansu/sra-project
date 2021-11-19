public algorithms.heap.HeapTreeNode clone() {
    try {
        super.clone();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return new algorithms.heap.HeapTreeNode(node, builtWord);
}