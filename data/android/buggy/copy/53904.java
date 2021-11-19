public void goToMainActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.android.ubclaunchpad.driver.UI.MainActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}