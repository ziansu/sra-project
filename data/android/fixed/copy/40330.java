@java.lang.Override
public void onRecovered(java.lang.String host) {
    naiveServiceAlarm.onRecovered(getServiceContext(host));
}