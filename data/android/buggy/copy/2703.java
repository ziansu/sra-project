public heronarts.lx.audio.LXAudioOutput setAudioInputStream(javax.sound.sampled.AudioInputStream inputStream) {
    this.inputStream = inputStream;
    java.lang.System.out.println("Try opening");
    open();
    return this;
}