@org.junit.Test
public void testTwoThrows() {
    try {
        game.addThrow(7);
        game.addThrow(2);
        assertEquals(game.getScore(), 4);
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}