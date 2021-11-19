@org.junit.Test
public void getName() throws java.lang.Exception {
    org.junit.Assert.assertNotNull(testNPC.getName());
    org.junit.Assert.assertEquals("getting the name of the NPC failing", "testNPC1", testNPC.getName());
}