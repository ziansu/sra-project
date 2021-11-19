@java.lang.Override
public void onStop() {
    super.onStop();
    groupRef.child(groupID).child("expenses").removeEventListener(groupListener);
}