@org.jetbrains.annotations.Nullable
@java.lang.Override
public java.lang.String getServerFingerprint() {
    for (net.groboclown.idea.p4ic.config.P4Config config : parents) {
        if (config.hasServerFingerprintSet()) {
            return config.getServerFingerprint();
        }
    }
    return null;
}