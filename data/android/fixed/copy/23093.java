@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    if (!(dialogIsDisplayed)) {
        (gameOver)++;
        newGame(holder);
    }
}