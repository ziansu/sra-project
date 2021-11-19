@javax.annotation.PostConstruct
public void init() {
    fintEvents.registerUpstreamListener("mock.no", no.fint.consumer.service.SubscriberService.class);
    healthCheck = fintEventsHealth.registerClient();
}