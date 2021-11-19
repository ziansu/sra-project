private void showMainActivity() {
    android.content.Intent mainIntent = new android.content.Intent(getApplicationContext(), com.farfromsober.ffs.activities.MainActivity.class);
    startActivity(mainIntent);
    this.finish();
}