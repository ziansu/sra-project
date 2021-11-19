@com.relaynetwork.automation.test.BeforeMethod
public void SuiteSetup() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.lang.System.out.println(dateFormat.format(cal.getTime()));
    com.relaynetwork.automation.test.ConnectBoxPage.GoTo();
}