public void setVisionEnabled(boolean enabled) {
    org.ligerbots.steamworks.subsystems.Vision.logger.info(java.lang.String.format("Setting vision enabled=%b", enabled));
    gearVision.table.putBoolean("enabled", enabled);
    boilerVision.table.putBoolean("enabled", enabled);
}