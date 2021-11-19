@java.lang.Override
public void onSuccess(java.lang.Long expirationTime) {
    if (expirationTime == (-1)) {
        pollingTimer.cancel();
        gov.nist.appvet.gwt.client.gui.AppVetPanel.showExpiredSessionMessage();
    }else {
        gov.nist.appvet.gwt.client.gui.AppVetPanel.sessionTimeLeft(expirationTime);
    }
}