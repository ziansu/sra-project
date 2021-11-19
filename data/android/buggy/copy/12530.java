public ClientPortal.RelayMessengerSendReceivePage verifyMessageInQueueTableValue(java.lang.String mobileNumber, boolean present) {
    core.Assertions.verify(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetMessageInQueue(RelayMessengerSendReceiveQueueField.MOBILE, core.Utilities.formatMobileNumber(mobileNumber)), present);
    return this;
}