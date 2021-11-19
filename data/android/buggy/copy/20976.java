public void onClick(android.view.View v) {
    android.content.Intent nextActivity = new android.content.Intent(this, com.turboocelots.oasis.controllers.WelcomeActivity.class);
    nextActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    nextActivity.putExtra("CurrentUser", currentUser.getUsername());
    startActivity(nextActivity);
}