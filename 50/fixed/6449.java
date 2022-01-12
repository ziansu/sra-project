public void increaseBeerCount() {
    (mBeerCount)++;
    mTotalBeersTextView.setText(getString(R.string.beers_had, mBeerCount));
    updateBAC();
}