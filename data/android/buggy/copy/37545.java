public void onClick(android.view.View v) {
    mCountDownTimer.pause();
    android.content.Intent intentMain = new android.content.Intent(this, com.example.masha.countdowntimer.DisplayExercises.class);
    this.startActivity(intentMain);
}