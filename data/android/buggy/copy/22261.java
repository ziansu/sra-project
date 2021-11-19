private static WAVLTree.WAVLNode doubleRotateLeftRight(WAVLTree.WAVLNode node) {
    node.leftNode = WAVLTree.rotateLeft(node.leftNode);
    WAVLTree.WAVLNode pivotNode = WAVLTree.rotateRight(node);
    return pivotNode;
}