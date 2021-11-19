public void release(org.wso2.carbon.apimgt.gateway.throttling.publisher.DataProcessAndPublishingAgent client) throws java.lang.Exception {
    client.setDataReference(null);
    clientPool.returnObject(client);
}