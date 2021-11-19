protected void handleLightChange(com.giganticsheep.wifilight.model.Light light) {
    this.light = light;
    if (viewsInitialised) {
        setLightDetails();
    }
}