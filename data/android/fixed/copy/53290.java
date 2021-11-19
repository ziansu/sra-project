@java.lang.Override
public void eventNotAccepted(org.springframework.messaging.Message<E> event) {
    com.sequenceiq.cloudbreak.core.flow2.config.AbstractFlowConfiguration.LOGGER.error("{} not accepted event: {}", getClass().getSimpleName(), event);
}