@org.testng.annotations.Test(expectedExceptions = java.lang.AssertionError.class)
public void testTransitionsToAgainstInvalidTransition() {
    com.github.liblevenshtein.assertion.StateTransitionFunctionAssertions.assertThat(transition.get()).transitionsTo(output, input, characteristicVector);
}