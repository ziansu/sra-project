@java.lang.Override
public void setCount(int count) {
    mCount = count;
    mCountView.setText(getResources().getString(mCountFormatResId, count));
}