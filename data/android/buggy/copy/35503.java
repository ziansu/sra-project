public void handleMessage(android.os.Message msg) {
    mTime.setText(getTime());
    mScore.setText(getString(R.string.score, mScoreValue));
    mGameView.update();
}