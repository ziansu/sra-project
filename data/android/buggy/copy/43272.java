@org.junit.Test
public void sfbug420() {
    expectedRACExit = 0;
    helpTCF("test/sfbug420", "test/sfbug420", "stack.StackImpl", "-show");
}