@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (com.example.musedroid.musedroid.FirebaseHandler.flag) {
        progressBar.setVisibility(View.GONE);
        com.example.musedroid.musedroid.FirebaseHandler.flag = false;
    }
}