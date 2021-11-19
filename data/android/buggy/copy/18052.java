@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.hasChild(user_id)) {
        startActivity(new android.content.Intent(this, dummy.popdesign.cllg_project.NavigationActivity.class));
    }else {
        android.widget.Toast.makeText(this, "You need to set up your account ", Toast.LENGTH_SHORT).show();
    }
}