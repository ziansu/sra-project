public org.iish.treemap.model.Treemap getTreeMap(java.lang.String name) {
    org.iish.treemap.model.Composite treeMap = new org.iish.treemap.model.Composite(name, name);
    addBranch(new java.util.LinkedList<>(hierarchyColumns), table.getRows(), treeMap);
    return treeMap;
}