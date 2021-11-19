private void startMainActivity() {
    android.content.Intent mainActivityIntent = new android.content.Intent(this, com.teamagam.gimelgimel.app.mainActivity.view.MainActivity.class);
    mainActivityIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(mainActivityIntent);
    this.finish();
}