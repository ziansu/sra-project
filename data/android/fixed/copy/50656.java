@java.lang.Override
public void onClick(android.view.View view) {
    button4.setText(((mark) + ""));
    placeMarkOnBoard(1, 0);
    button4.setEnabled(false);
    checkForWinOrDraw();
}