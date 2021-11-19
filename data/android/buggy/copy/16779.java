@java.lang.Override
protected void onStop() {
    super.onDestroy();
    org.dhis2.messenger.core.xmpp.XMPPClient.getInstance().leaveMUC();
    org.dhis2.messenger.core.xmpp.XMPPSessionStorage.getInstance().setCallback(null);
}