@java.lang.Override
public void onTouched(nl.saxion.act.playground.model.GameBoard gameBoard) {
    android.util.Log.d(SoZGame.TAG, "Touched Enemy");
    callMovement(gameBoard);
    gameBoard.updateView();
}