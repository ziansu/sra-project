@org.junit.Test
public void testEqualsTrue() {
    nl.tudelft.pixelperfect.player.Player otherTest = createPlayer("Lorem Ipsum");
    org.junit.Assert.assertTrue(testObject.equals(otherTest));
}