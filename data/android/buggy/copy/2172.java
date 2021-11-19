private void updateCountLabels() {
    _possitiveCountLabel.setText(getContext().getString(R.string.rating_total, _possitiveCount));
    _negativeCountLabel.setText(getContext().getString(R.string.rating_total, _negativeCount));
}