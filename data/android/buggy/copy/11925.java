@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (updateProfileImage)
        removeProfilePic();
    
    startActivity(new android.content.Intent(this, btracker.example.raggitha.btracker.profileActivity.class));
    finish();
}