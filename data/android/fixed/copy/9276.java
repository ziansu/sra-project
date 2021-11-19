@org.junit.Test
public void checkEmailField() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.txtEmail)).perform(android.support.test.espresso.action.ViewActions.click());
}