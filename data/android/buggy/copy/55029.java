@org.junit.Test
public void testGetBotRight() {
    org.junit.Assert.assertNull(plateauTest.getCase("I12").getSouth());
    org.junit.Assert.assertNull(plateauTest.getCase("I12").getEast());
}