public void testSimple() {
    org.alljoyn.bus.ObserverTest.Participant provider = new org.alljoyn.bus.ObserverTest.Participant("prov");
    org.alljoyn.bus.ObserverTest.Participant consumer = new org.alljoyn.bus.ObserverTest.Participant("cons");
    simpleScenario(provider, consumer);
    provider.stop();
    consumer.stop();
}