@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    sessionId = dataSnapshot.child("session_id").getValue().toString();
}