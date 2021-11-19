@org.testng.annotations.Test(expectedExceptions = java.lang.AssertionError.class)
public void testTransitionsToAgainstInvalidTransition() {
    org.mockito.Mockito.when(transition.get().of(input, characteristicVector)).thenReturn(output);
    com.github.liblevenshtein.assertion.StateTransitionFunctionAssertions.assertThat(transition.get()).transitionsTo(output, null, characteristicVector);
}