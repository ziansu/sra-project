@java.lang.Override
public int getViewTypeCount() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        return 1;
    }
    return mSpinnerAdapter.getViewTypeCount();
}