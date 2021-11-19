public void moveInto(spirite.image_data.GroupTree.Node nodeToMove, spirite.image_data.GroupTree.GroupNode nodeInto) {
    groups.moveInto(nodeToMove, nodeInto);
    alertStructureChanged();
}