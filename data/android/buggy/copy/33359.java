public void resumeGame(android.view.View v) {
    finalproject.tap.PlayActivity.pausestatus = 0;
    finalproject.tap.PlayActivity.timerPaused = false;
    finalproject.tap.PlayActivity.timerResume = true;
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.PlayActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
    finish();
}