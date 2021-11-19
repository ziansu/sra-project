@cucumber.api.java.en.Then(value = "^I wait a second$")
public void iWaitForASecond() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(1000);
}