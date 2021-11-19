public void configure(java.util.Map<java.lang.String, ?> configs, boolean isKey) {
    org.springframework.kafka.support.serializer.JsonSerializer.LOGGER.debug("Start configuring");
    writer = org.springframework.kafka.support.serializer.JsonDatabindFactory.createSerializer(configs, isKey);
    org.springframework.kafka.support.serializer.JsonSerializer.LOGGER.debug("Finish configuring");
}