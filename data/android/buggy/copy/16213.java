private void goToWelcome() {
    android.content.Intent intent = new android.content.Intent(this, edu.gatech.cs2340.rattracker.controller.WelcomeActivity.class);
    startActivity(intent);
    finish();
}