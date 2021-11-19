private int rebalance(WAVLTree.WAVLNode node, int cnt) {
    WAVLTree.WAVLNode parent = node.parent;
    int parank = parent.rank;
    if (parank == 0) {
        parent.rank = 1;
        cnt += 1;
        this.root.rebalance(parent);
    }
    return cnt;
}