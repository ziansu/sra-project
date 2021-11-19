public void initObject(bantam.interp.ObjectData objectData, bantam.util.ClassTreeNode classTreeNode) {
    this.objectData = objectData;
    this.addMembers(classTreeNode);
}