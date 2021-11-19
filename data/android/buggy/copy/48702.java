@org.junit.Test
public void validateEditText() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.locationEditText)).perform(android.support.test.espresso.action.ViewActions.typeText("Portland")).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.withText("Portland")));
}