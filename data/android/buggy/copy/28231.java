public void loadSoundSample(repository.SoundSample soundSample) {
    if (!(sounds.containsKey(soundSample))) {
        sounds.put(soundSample, loadSoundSamplePlayer(soundSample));
    }
}