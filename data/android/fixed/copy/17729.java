public static synchronized boolean shouldExecuteBeforeSuite() {
    if (!(com.consol.citrus.junit.TestSuiteState.beforeSuiteState)) {
        com.consol.citrus.junit.TestSuiteState.beforeSuiteState = true;
        return true;
    }else {
        return false;
    }
}