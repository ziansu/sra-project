public java.lang.String max() {
    if (this.empty()) {
        return null;
    }
    WAVLTree.WAVLNode currNode = this.root;
    while (!(currNode.isExt())) {
        currNode = currNode.right;
    } 
    return currNode.info;
}