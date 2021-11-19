@java.lang.Override
public void onClick(android.view.View view) {
    button3.setText(((mark) + ""));
    placeMarkOnBoard(0, 2);
    button3.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}