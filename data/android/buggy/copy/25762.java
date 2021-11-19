public void setTitle(java.lang.CharSequence title, android.widget.TextView.BufferType bufferType) {
    if (title != null) {
        mTitleView.setText(title);
        mTitleView.setVisibility(edu.mit.mitmobile2.VISIBLE);
    }else {
        mTitleView.setVisibility(edu.mit.mitmobile2.GONE);
    }
}