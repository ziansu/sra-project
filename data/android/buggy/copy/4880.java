@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    previousThisMonthTotal = dataSnapshot.getValue(java.lang.Double.class);
}