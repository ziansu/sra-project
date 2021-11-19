@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mTimer) != null)
        mTimer.cancel();
    
    if ((mDatasource) != null)
        mDatasource.close();
    
}