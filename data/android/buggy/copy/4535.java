@java.lang.Override
public void setPort(int port) {
    mSendHandler.removeMessages(com.zhuozhi.monitor.MonitorService.SEND_MESSAGE);
    mSendHandler.obtainMessage(com.zhuozhi.monitor.MonitorService.START_CLIENT, port, 0, mTCPlient.getIp()).sendToTarget();
}