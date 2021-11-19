public org.cytoscape.internal.view.NetworkViewContainer getCurrentContainer() {
    for (org.cytoscape.internal.view.NetworkViewComparisonPanel.ViewPanel vp : viewPanels.values()) {
        if (vp.getNetworkView().equals(currentNetworkView))
            return vp.getNetworkViewContainer();
        
    }
    return null;
}