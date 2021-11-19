@cucumber.api.java.en.Given(value = "^today is (.+)$")
public void today_is(@cucumber.api.Format(value = "yyyy-MM-dd")
java.util.Date date) {
    calculator = new com.cucumber.testng.examples.DateCalculator(date);
    scenario.write("<b>This is test message</b>");
    super.runCucumberStep(new com.cucumber.testng.examples.AteProjectFilter("easyApply", "applyQAJob", "stepOpenHomePage"));
}