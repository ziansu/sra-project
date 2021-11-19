@org.junit.Test
public void testStepForward() {
    logic.clean();
    int original = logic.checkStep();
    logic.stepForward();
    assertEquals(logic.checkStep(), (original + 1));
}