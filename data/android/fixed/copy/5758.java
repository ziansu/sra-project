@org.junit.Test
public void testMoveBackwardParkStatus() throws java.lang.Exception {
    int[] i = phaseOne.moveBackward();
    org.junit.Assert.assertEquals(0, i[1]);
}