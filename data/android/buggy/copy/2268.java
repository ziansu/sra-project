@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot snapshot, java.lang.String previousChildKey) {
    if ((snapshot.getChildrenCount()) >= 6) {
        mTeamFull = true;
    }
}