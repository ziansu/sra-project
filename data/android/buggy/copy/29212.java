public void sendRequestInfo(java.lang.String TargetUId, java.lang.Object Content) {
    org.catchyou.api.models.ChatData data = new org.catchyou.api.models.ChatData();
    data.type = org.catchyou.api.models.ChatType.RequestInfo;
    data.targetUId = TargetUId;
    data.content = true;
    send(data);
}