public void resume() {
    if ((com.alibaba.rocketmq.client.ClientStatus.SUSPENDED) == (status)) {
        localMessageStore.resume();
        for (com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer defaultMQPushConsumer : defaultMQPushConsumers) {
            defaultMQPushConsumer.resume();
        }
        status = com.alibaba.rocketmq.client.ClientStatus.ACTIVE;
    }
}