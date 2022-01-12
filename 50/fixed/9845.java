@java.lang.Override
public void processFinish(com.group02.guard.AsyncGetConnectivityData.Wrapper output) {
    mSsid = output.ssid;
    mIp = output.ip;
    mNetworkpass = output.password;
}