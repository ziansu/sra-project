public static void saveDebugImage(java.lang.Class implementationClass, java.lang.String function, java.lang.String identifier, org.opencv.core.Mat mat) {
    if (mat == null) {
        return ;
    }
    org.openpnp.util.OpenCvUtils.saveDebugImage(implementationClass, function, identifier, org.openpnp.util.OpenCvUtils.toBufferedImage(mat));
}