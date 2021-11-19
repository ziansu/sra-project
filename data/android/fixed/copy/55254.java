@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        userFirstName = dataSnapshot.getValue().toString();
        userName.setText(userFirstName);
    }
}