@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot snapshot) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onChildRemoved", "child", snapshot.getValue());
}