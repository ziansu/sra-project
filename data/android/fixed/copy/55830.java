public java.lang.Boolean checkWin(com.delacrixmorgan.kingscup.adapter.CardAdapter adapter) {
    mDeck.remove(mCurrentCardPosition);
    adapter.notifyItemRemoved(mCurrentCardPosition);
    mCurrentCardPosition = 0;
    mCardSelected = false;
    return (mKingCounter) < 1;
}