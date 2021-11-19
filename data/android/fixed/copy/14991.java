public void onNodeExpandTargetTable(org.primefaces.event.NodeExpandEvent event) {
    com.dbms.view.IARelationsTreeHelper treeHelper = new com.dbms.view.IARelationsTreeHelper(cmqBaseCurrentService, smqBaseCurrentService, meddraDictCurrentService, cmqRelationCurrentService, cmqBaseTargetService, smqBaseTargetService, meddraDictTargetService, cmqRelationTargetService);
    treeHelper.onNodeExpandTargetTable(targetTableRootTreeNode, event);
}