private void handleFirstRun() {
    if (com.darkrockstudios.iot.adventurephotoframe.Settings.getFirstRun(this)) {
        startActivity(new android.content.Intent(this, com.darkrockstudios.iot.adventurephotoframe.WelcomeActivity.class));
    }
}