public static boolean getMessageExists(java.lang.String mobileNumber) {
    return core.Actions.find(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetMessageInQueue(RelayMessengerSendReceiveQueueField.MOBILE, mobileNumber));
}