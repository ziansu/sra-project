public void onDeleteSpell() {
    if ((mListener) != null) {
        mListener.onDeleteChosenSpell(mIndex, mSpell);
    }
}