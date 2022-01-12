@AfterMethod(alwaysRun = true)
public final void reset() {
    core.Browser.closeWindow(common.WireBrowser.Instance());
    core.Browser.closeWindow(common.ClientPortalBrowser.Instance());
}