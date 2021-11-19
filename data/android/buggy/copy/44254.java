public static boolean isGaugeProjectDir(java.io.File dir) {
    return (com.thoughtworks.gauge.util.GaugeUtil.containsManifest(dir)) && (com.thoughtworks.gauge.util.GaugeUtil.containsSpecsDir(dir));
}