@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        mTextView.setText(("Read Tag: " + result));
        mShowContentButton.setEnabled(true);
    }
}