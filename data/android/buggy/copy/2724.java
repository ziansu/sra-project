@java.lang.Override
public void handle(final java.util.List<ch.cyberduck.core.DescriptiveUrl> selected) {
    for (ch.cyberduck.core.DescriptiveUrl url : selected) {
        ch.cyberduck.core.local.BrowserLauncherFactory.get().open(url.getUrl());
    }
}