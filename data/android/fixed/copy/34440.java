@org.junit.Test
public void testStop() throws javafx.scene.media.MediaException {
    test.play();
    test.stop();
    org.junit.Assert.assertFalse(test.isRunning());
}