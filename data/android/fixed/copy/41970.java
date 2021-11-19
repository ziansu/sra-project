@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.String value = dataSnapshot.getValue(java.lang.String.class);
    java.lang.System.out.println(("Value is: " + value));
}