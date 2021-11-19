public void onClick(android.content.DialogInterface dialog, int ID) {
    saveUserBio();
    android.content.Intent refreshProfile = new android.content.Intent(this, com.example.gurpreetsingh.encircleme.UserProfileActivity.class);
    startActivity(refreshProfile);
}