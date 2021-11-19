public void setLeftText(java.lang.CharSequence text) {
    if ((leftTextView) == null) {
        leftTextView = ((android.widget.TextView) (leftTextViewStub.inflate()));
    }
    leftTextView.setText(text);
}