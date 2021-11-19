public T max() {
    dushyant.lib.datastructures.AVLTree<T>.Node node = root;
    T data = null;
    while ((node.right) != null) {
        node = node.right;
    } 
    data = node.data;
    return data;
}