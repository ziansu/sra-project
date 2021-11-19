public java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup> getConsumers(java.lang.String topic) {
    return new java.util.ArrayList(m_metaService.getMeta().getTopics().get(topic).getConsumerGroups().values());
}