public static void changeBrightness(int lightPosition, int brightness) {
    com.philips.lighting.model.PHBridge bridge = com.philips.lighting.hue.sdk.PHHueSDK.getInstance().getSelectedBridge();
    com.philips.lighting.model.PHLight light = app.lights.prism.com.prismlights.HueBulbChangeUtility.getLightFromPosition(lightPosition, bridge);
    app.lights.prism.com.prismlights.HueBulbChangeUtility.changeBrightness(light, brightness);
}