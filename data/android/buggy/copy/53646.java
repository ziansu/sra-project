public void onUnselectCurrentRowTreeTable(org.primefaces.event.NodeUnselectEvent event) {
    setReviewEnabled(false);
    setApproveEnabled(false);
    setDemoteEnabled(false);
    if ((currentOrTarget) == (com.dbms.controller.ImpactSearchController.SELECTED_CURRENT_LIST))
        currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_NO_LIST;
    
}