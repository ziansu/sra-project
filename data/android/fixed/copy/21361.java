@org.junit.Test
public void testToRunAfterSync() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recipeGrid)).perform(android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition(1, android.support.test.espresso.action.ViewActions.click()));
}