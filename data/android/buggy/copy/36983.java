@org.springframework.context.annotation.Bean
@org.springframework.beans.factory.annotation.Qualifier(value = "shutdownEventSenderClient")
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = "org.ametiste.scm.messaging.sender.client.enabled", matchIfMissing = true)
public org.ametiste.scm.messaging.sender.client.EventSenderClient shutdownEventSenderClient() throws java.net.URISyntaxException {
    return new org.ametiste.scm.messaging.sender.client.EventSenderClient(shutdownEventFactory, eventSender, org.ametiste.scm.messaging.sender.client.config.MessagingClientsConfiguration.safeUri(clientProps.getTargetUri()), clientProps.isStrict());
}