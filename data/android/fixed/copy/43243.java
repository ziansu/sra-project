protected void createNetwork() {
    expiredSession.setStatus(NetworkSession.Status.EXPIRED);
    device1.setSdwnController(controller);
    device1.setSinkAddress(0L);
    device2.setSdwnController(controller);
    device2.setSinkAddress(1L);
}