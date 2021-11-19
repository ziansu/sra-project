public void onFinish() {
    showtimer.setText("END TIMER");
    com.itproject.android.androidtvsample.MainActivity.mp.stop();
    android.content.Intent intent = new android.content.Intent(this, com.itproject.android.androidtvsample.WelcomeActivity.class);
    finish();
    startActivity(intent);
}