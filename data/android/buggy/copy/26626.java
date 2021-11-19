@org.junit.Test
public void PasswordResetScreenToLoginScreenTransistion() throws java.lang.Exception {
    launchActivityWithIntent();
    onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.regBackBtn)).perform(android.support.test.espresso.action.ViewActions.click());
}