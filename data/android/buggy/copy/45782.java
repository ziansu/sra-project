@org.junit.Test
public void sfbug408() {
    expectedExit = 0;
    helpTCF("test/sfbug408", "test/sfbug408", "-cp", "test/sfbug408", "-esc", "-progress");
}