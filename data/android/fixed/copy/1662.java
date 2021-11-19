@java.lang.Override
public void onRemoveItem(com.java.clientserver.serverside.ConnectThread aConnectThread) {
    userList.remove(aConnectThread);
    java.lang.String msg = ("-- " + (aConnectThread.getClientName())) + " leaved\n";
    onBroadcastMsg(msg);
}