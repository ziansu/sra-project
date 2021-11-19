@java.lang.Override
public void setTitle(java.lang.CharSequence title) {
    try {
        mTitleText.setText(title);
    } catch (java.lang.NullPointerException e) {
        super.setTitle(title);
    }
}