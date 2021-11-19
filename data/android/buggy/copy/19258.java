@org.junit.Test
public void testStepForward() {
    logic.clean();
    int original = logic.checkStep();
    logic.stepForward(1);
    assertEquals(logic.checkStep(), (original + 1));
}