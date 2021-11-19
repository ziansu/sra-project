@com.relaynetwork.automation.test.BeforeMethod
public void SuiteSetup() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.lang.System.out.println(dateFormat.format(cal.getTime()));
    java.lang.System.out.println("Running before test suite");
    com.relaynetwork.automation.test.ConnectBoxPage.GoTo();
}