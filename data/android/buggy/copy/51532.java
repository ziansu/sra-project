@org.junit.Test
public void ПоискERRORСообщенийПользователя() {
    bxtr.LogSearch logSearch = new bxtr.LogSearch(new bxtr.finder.SimpleReader()).file(test.SimpleTests.TEST_APPLICATION_LOG_FILE).find(((java.util.Observer) (new bxtr.finder.UserErrorFinder("podolyak-ea")))).execute();
    logSearch.consoleLog();
}