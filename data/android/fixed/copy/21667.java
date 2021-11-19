@java.lang.Override
public void isCurrentUserPermitted(com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Boolean> callback) {
    org.roda.wui.client.common.UserLogin.getInstance().checkRoles(new org.roda.wui.common.client.HistoryResolver[]{ FormatRegister.RESOLVER , RiskRegister.RESOLVER }, false, callback);
}