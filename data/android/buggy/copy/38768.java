@org.junit.Test
public final void playTest2() {
    snd2.play();
    org.junit.Assert.assertTrue(((snd2.isPlaying()) || (snd.unvalidDevice())));
}