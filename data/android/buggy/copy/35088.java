public V min() {
    Node<V> node = root;
    while ((node.left) != null) {
        node = node.left;
    } 
    return node.value;
}