@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot snapshot) {
    int index = getIndexForKey(snapshot.getKey());
    mSnapshots.remove(index);
    notifyChangedListeners(ChangeEventListener.EventType.REMOVED, index);
}