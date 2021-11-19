@java.lang.Override
public void execute(info.novatec.testit.webtester.api.browser.Browser browser) {
    info.novatec.testit.webtester.eventsystem.events.browser.ClosedWindowEvent event = new info.novatec.testit.webtester.eventsystem.events.browser.ClosedWindowEvent(browser);
    getWebDriver().close();
    info.novatec.testit.webtester.eventsystem.EventSystem.fireEvent(event);
}