@java.lang.Override
public void onChange(boolean selfChange) {
    if (DebugLog.DEBUG)
        android.util.Log.d(edu.nd.darts.cimon.MMSInfoService.TAG, "MMSInfoService - MmsContentObserver: changed");
    
    getMmsData();
    super.onChange(selfChange);
}