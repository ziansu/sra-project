@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "DM_GC")
private void cleanUpFromJosmFixture() {
    org.openstreetmap.josm.Main.getLayerManager().resetState();
    org.openstreetmap.josm.Main.pref = null;
    org.openstreetmap.josm.Main.platform = null;
    java.lang.System.gc();
}