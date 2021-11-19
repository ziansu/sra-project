@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    if (remoteObject != null)
        remoteObject.notify("onCancelled", "error", error.getMessage());
    
}