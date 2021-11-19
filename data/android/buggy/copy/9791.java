@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    TicTacToeGame.sInfoColor = mInfoTextView.getTextColors();
    TicTacToeGame.sInfo = mInfoTextView.getText().toString();
    return ;
}