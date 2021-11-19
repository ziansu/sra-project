public junit.framework.TestSuite getSuite(java.lang.String suiteCase) {
    if (suiteCase == "TestRebtelAndroid") {
        return new junit.framework.TestSuite(com.rebtel.test.TestRebtelAndroid.class);
    }else
        if (suiteCase == "TestRebteliOS") {
        }
    
    return new junit.framework.TestSuite(com.rebtel.test.TestRebtelAndroid.class);
}