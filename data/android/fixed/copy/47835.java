@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    eventExists.findViewById(R.id.event_exists);
    eventExists.setVisibility(View.GONE);
}