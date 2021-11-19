public void registerTab(boolean select, java.lang.String tabName) {
    this.tabName = tabName;
    gov.nist.toolkit.xdstools2.client.TabContainer.instance().addTab(tabTopRawPanel, tabName, select);
}