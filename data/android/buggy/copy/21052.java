@java.lang.Override
protected void onStopLoading() {
    cancelLoad();
    com.ghostflying.portalwaitinglist.util.SettingUtil.unregisterObserver();
    if ((mHelper) != null)
        mHelper.unregisterContentObserver(mContentObserver);
    
    isObserved = false;
}