@java.lang.Override
public void onClick(android.view.View view) {
    button7.setText(((mark) + ""));
    placeMarkOnBoard(2, 0);
    button7.setEnabled(false);
    checkForWinOrDraw();
}