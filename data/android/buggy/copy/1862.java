public void onTick(long millisUntilFinished) {
    remainingClickTime -= 50;
    gameTimeAndScore.updateTimeBar(remainingClickTime);
    if ((remainingClickTime) <= 0) {
        gameover = true;
    }
    startedTimer = true;
}