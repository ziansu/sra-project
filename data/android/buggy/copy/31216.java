@java.lang.Override
protected void onResume() {
    super.onResume();
    makeToast("onResume!!");
    if (!(isDataMapServiceBound)) {
        isDataMapServiceBound = true;
        bindService(new android.content.Intent(this, com.qi.airstat.dataMap.DataMapService.class), serviceConnection, Context.BIND_AUTO_CREATE);
    }
}