public Product remove(int id) {
    ProductBinarySearchTree.Node target = this.find(id);
    this.remove(target, this.root);
    return target.element;
}