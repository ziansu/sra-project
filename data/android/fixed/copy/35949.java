@org.junit.Test
public void adjustToErrorCorrectlyUpdatesInputs() {
    testP.activate();
    testP.adjustToError();
    testP.activate();
    final double expectedOutput = 0.8980880967;
    assertEquals(expectedOutput, testP.output(), DELTA);
}