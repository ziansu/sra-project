@java.lang.Override
public void onSucceeded(java.lang.Void result) {
    if ((mListener) != null) {
        mListener.onConfigurationChanged();
    }
}