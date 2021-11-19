protected BST<T>.TreeNode<T> _get_max_node(BST<T>.TreeNode<T> node) {
    while ((node.get_right()) != null) {
        node = node.get_right();
    } 
    return node;
}