@java.lang.Override
public void setPort(int port) {
    if ((mTCPlient) != null) {
        mSendHandler.obtainMessage(com.zhuozhi.monitor.MonitorService.START_CLIENT, port, 0, mTCPlient.getIp()).sendToTarget();
    }
}