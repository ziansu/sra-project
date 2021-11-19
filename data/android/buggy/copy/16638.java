public boolean isConfigured(final java.lang.String name) {
    org.runnerup.export.Synchronizer l = synchronizers.get(name);
    if (l == null) {
        return true;
    }
    return l.isConfigured();
}