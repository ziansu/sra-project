private int videoPreferredAspect() {
    return java.lang.Math.round(configuration.getDesiredVideoWidthHeight().getAspectRatio());
}