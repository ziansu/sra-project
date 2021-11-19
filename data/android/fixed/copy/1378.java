protected void countATap() {
    if ((tapCount) == 0) {
        start();
    }
    (tapCount)++;
    tapCountTextView.setText(java.lang.String.format(java.util.Locale.getDefault(), "%2d", tapCount));
}