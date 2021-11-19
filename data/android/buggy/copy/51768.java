private int min(tree.Node root) {
    if ((root.getLeft()) == null) {
        return root.getValue();
    }else {
        return max(root.getLeft());
    }
}