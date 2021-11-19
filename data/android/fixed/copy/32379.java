private void setLoggedIn(boolean loggedIn) {
    if (loggedIn) {
        android.content.Intent in = new android.content.Intent(this, com.activity.nikhilesh.dropphoto.PictureActivity.class);
        startActivity(in);
        finish();
    }
}