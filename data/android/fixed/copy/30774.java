public com.qfree.rocketlauncher.model.JsonRocket updateRocket(final int id, final com.qfree.rocketlauncher.model.JsonInputRocket rocket) {
    log.info("Updating rocket with id: '{}'", id);
    return toJsonRocket(rocketLauncherPersistenceLayer.updateRocket(id, toRocket(rocket, id)));
}