@java.lang.Override
public void processFinish(com.group02.guard.AsyncGetConnectivityData.Wrapper output) {
    mSsid = output.ssid;
    android.util.Log.d("processFinish", output.ssid);
    mIp = output.ip;
    android.util.Log.d("processFinish", output.ip);
    mNetworkpass = output.password;
    android.util.Log.d("processFinish", output.password);
}