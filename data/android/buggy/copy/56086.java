@cucumber.api.java.en.Then(value = "^I wait a second$")
public void iWaitForASecond(int secs) throws java.lang.InterruptedException {
    java.lang.Thread.sleep(1000);
}