public void increaseBeerCount(android.view.View v) {
    (mBeerCount)++;
    mTotalBeersTextView.setText(getString(R.string.beers_had, mBeerCount));
    updateBAC();
}