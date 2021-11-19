protected void countATap() {
    (tapCount)++;
    tapCountTextView.setText(java.lang.String.format(java.util.Locale.getDefault(), "%2d", tapCount));
}