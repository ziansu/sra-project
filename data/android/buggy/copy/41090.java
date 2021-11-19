@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mNote) != null) {
        mComment = null;
    }
    org.wordpress.android.util.EditTextUtils.hideSoftInput(mEditReply);
}