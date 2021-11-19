private boolean isAfterSuiteConfigMethod(org.testng.ITestResult iTestResult) {
    if (getConfigMethodType(iTestResult).equals(ru.yandex.qatools.allure.testng.AllureTestListener.ConfigMethodType.AfterSuite)) {
        return true;
    }
    return false;
}