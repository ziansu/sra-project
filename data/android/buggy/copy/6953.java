@java.lang.Override
public void connectionLost(java.lang.Throwable cause) {
    com.qhiehome.ihome.util.LogUtil.d(com.qhiehome.ihome.lock.gateway.GateWayClient.TAG, "The connection was lost");
    subscribeTopic = "/status/lock/ap/v2/";
    publishTopic = "/set/lock/ap/v2/";
}