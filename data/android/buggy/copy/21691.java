@java.lang.Override
public void onFinish(org.testng.ITestContext iTestContext) {
    getLifecycle().fire(new ru.yandex.qatools.allure.events.TestSuiteFinishedEvent(getSuiteUid(iTestContext)));
}