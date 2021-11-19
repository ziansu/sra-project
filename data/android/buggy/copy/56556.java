@java.lang.Override
public void onChildMoved(com.google.firebase.database.DataSnapshot snapshot, java.lang.String previousChildName) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onChildMoved", "child", snapshot.getValue());
}