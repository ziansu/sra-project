public int timeToUncmpLoc(int timeMs) {
    return ((int) (java.lang.Math.round((((wycliffeassociates.recordingapp.AudioInfo.SAMPLERATE) * timeMs) / 1000.0)))) * 2;
}