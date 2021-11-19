public void setVisionEnabled(boolean enabled) {
    gearVision.table.putBoolean("enabled", enabled);
    boilerVision.table.putBoolean("enabled", enabled);
}