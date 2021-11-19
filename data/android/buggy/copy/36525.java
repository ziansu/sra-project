@org.junit.Test
public final void loopTest2() {
    snd2.loop(5);
    org.junit.Assert.assertTrue(((snd2.isPlaying()) || (snd.unvalidDevice())));
}