public ClientPortal.RelayMessengerSendReceivePage clickTab(ClientPortal.enums.RelayMessengerSendReceiveTab tab) {
    core.Actions.click(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetTab(tab));
    return this;
}