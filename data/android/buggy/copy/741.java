@AfterMethod(alwaysRun = true)
public final void reset() {
    core.Browser.closeWindow(common.WireBrowser.Instance());
    clientportal.WireMessagesPage.Goto();
    core.Browser.refresh(common.ClientPortalBrowser.Instance());
}