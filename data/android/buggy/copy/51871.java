public void onRestart() {
    createLevel();
    resetGraphycs();
    menuButton.unpress();
    MainActivity.GAME_PHASE = MainActivity.Phase.REDACTOR;
    snred = false;
    snredh = false;
    snredt = false;
    move = true;
    com.zheleproduction.zhelesnake.Redactor.dialogIsClosed = true;
}