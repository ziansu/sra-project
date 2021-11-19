@java.lang.Override
public void onCreate() {
    org.nypl.simplified.app.Simplified.LOG.debug("starting app: pid {}", java.lang.Integer.valueOf(android.os.Process.myPid()));
    org.nypl.simplified.app.Simplified.INSTANCE = this;
    initBugsnag(org.nypl.simplified.app.Bugsnag.getApiToken(this.getAssets()));
}