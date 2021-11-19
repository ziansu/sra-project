@java.lang.Override
public void deactivate() {
    com.stdnull.runmap.common.CFLog.i("TAG", "deactivate");
    mStateListener.notifyServiceDeactivate();
    mLocationChangedListener = null;
    com.stdnull.runmap.GlobalApplication.getAppContext().getContentResolver().unregisterContentObserver(mGpsMonitor);
}