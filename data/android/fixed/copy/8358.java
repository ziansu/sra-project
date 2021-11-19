public void WriteExpandingNodeToFile(Node ExpandingNode) {
    for (Leaf leafToWrite : ExpandingNode.getNodeLeaves()) {
        leafToWrite.WriteEachLeaf();
    }
}