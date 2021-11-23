@java.lang.Override
public void onMessage(javax.jms.Message msg) {
    client.Client.print("onMessage");
    try {
        renderResponse(msg.getBody(common.ServerResponse.class));
    } catch (javax.jms.JMSException e) {
        e.printStackTrace();
    }
}