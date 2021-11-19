public void stop() {
    application.close();
    log.info("stop : OK");
    initiator.stop();
}