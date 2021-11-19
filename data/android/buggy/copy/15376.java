private byte[] pcmToWav(byte[] pcm) {
    return ee.ioc.phon.android.speechutils.utils.AudioUtils.getRecordingAsWav(pcm, getSampleRate(), ee.ioc.phon.android.speechutils.RESOLUTION_IN_BYTES, ee.ioc.phon.android.speechutils.CHANNELS);
}