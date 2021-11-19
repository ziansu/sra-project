@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((isFirstClickDo) && (!(isGameEnd))) {
        iantry.minesweeper.classes.application.GameFieldSaveAndRestore fieldSaveAndRestore = new iantry.minesweeper.classes.application.GameFieldSaveAndRestore(this, gameField, elapsedSeconds);
        fieldSaveAndRestore.save();
    }
}