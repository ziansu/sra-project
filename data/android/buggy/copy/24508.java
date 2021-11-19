public void init(org.apache.pivot.collections.List<dcp.logic.model.Group> groups, org.apache.pivot.collections.List<dcp.logic.model.Pack> packs) {
    facade.importDataFrom(groups, packs, false);
    treeView.expandAll();
    setModified(false);
}