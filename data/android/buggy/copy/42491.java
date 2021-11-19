@java.lang.Override
public void onUserList(java.util.List<java.lang.String> users) {
    connector.getEbus().removeAll();
    channelsFuture.setResult(users);
}