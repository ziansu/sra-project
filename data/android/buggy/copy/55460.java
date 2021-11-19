public ClientPortal.RelayMessengerSendReceivePage clickTab(ClientPortal.enums.RelayMessengerSendReceiveTab tab) {
    core.Actions.click(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetTab(tab));
    core.Wait.waitFor(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.getTabTable(tab), true);
    return this;
}