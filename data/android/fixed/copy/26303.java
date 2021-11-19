private void startFilesActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.seafile.seadroid2.ui.activity.BrowserActivity.class);
    finish();
    startActivity(intent);
}