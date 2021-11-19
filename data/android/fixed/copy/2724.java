@java.lang.Override
public void handle(final java.util.List<java.lang.String> selected) {
    for (java.lang.String url : selected) {
        ch.cyberduck.core.local.BrowserLauncherFactory.get().open(url);
    }
}