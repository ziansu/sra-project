public com.qfree.rocketlauncher.model.JsonRocket createRocket(final com.qfree.rocketlauncher.model.JsonInputRocket rocket) {
    log.info("Creating rocket created by: {}", rocket.getName());
    return toJsonRocket(rocketLauncherPersistenceLayer.createRocket(toRocket(rocket)));
}