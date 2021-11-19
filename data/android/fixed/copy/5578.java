public void setActiveAudioOutput(java.lang.String audioOutput) {
    pcs.firePropertyChange(org.jtrfp.trcl.core.TRConfiguration.ACTIVE_AUDIO_OUTPUT, this.activeAudioOutput, audioOutput);
    this.activeAudioOutput = audioOutput;
}