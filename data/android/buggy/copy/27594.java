private void clearPreviousView(android.widget.TextView previousView) {
    if (previousView != null) {
        previousView.setText("");
        android.util.Log.d("rollCredits", ("Previous view being cleared down: " + (previousView.toString())));
    }
}