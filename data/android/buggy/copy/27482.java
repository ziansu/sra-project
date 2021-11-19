@java.lang.Override
public void onMoveRemade(org.empyrn.darkknight.gamelogic.Move m) {
    mChessBoardView.clearSelection();
    mChessBoardView.setPosition(mGameController.getGame().currPos());
    moveListView.setText(getPGNTokenReceiver().getSpannableData());
    invalidateUi();
}