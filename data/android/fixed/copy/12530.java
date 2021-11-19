public ClientPortal.RelayMessengerSendReceivePage verifyMessageInQueueTableValue(java.lang.String mobileNumber, boolean present) {
    core.Assertions.verify(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetMessageInQueue(RelayMessengerSendReceiveQueueField.MOBILE, mobileNumber), present);
    return this;
}