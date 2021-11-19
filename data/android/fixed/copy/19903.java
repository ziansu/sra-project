@java.lang.Override
public void onDataChange(final com.google.firebase.database.DataSnapshot snapshot) {
    editText.setSummary(snapshot.getValue(java.lang.String.class));
    editText.setText(snapshot.getValue(java.lang.String.class));
}