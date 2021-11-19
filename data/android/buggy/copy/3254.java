public void appendMsg(java.lang.String msg) {
    android.util.Log.i(TAG, (("MainActivity.appendMsg(" + msg) + ")"));
    mTextView.setText((((mTextView.getText()) + "\n") + msg));
}