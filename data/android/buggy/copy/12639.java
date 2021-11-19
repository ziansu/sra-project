@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.content.Intent intent = new android.content.Intent(this, com.app.scope.myapplication.MainActivity.class);
    startActivity(intent);
    finish();
}