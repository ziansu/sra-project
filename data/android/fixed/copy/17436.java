@java.lang.Override
public org.achtern.AchternEngine.core.audio.openal.AudioSource get() throws java.lang.Exception {
    org.achtern.AchternEngine.core.audio.openal.AudioBuffer buffer = new org.achtern.AchternEngine.core.audio.openal.AudioBuffer(data, frequency, format);
    cache(buffer);
    this.data.clear();
    return new org.achtern.AchternEngine.core.audio.openal.AudioSource(buffer);
}