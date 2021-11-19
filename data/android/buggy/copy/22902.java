public com.mobileer.miditools.synth.SynthVoice createVoice(int program) {
    if ((program & 1) == 1) {
        return new com.mobileer.miditools.synth.SineVoice(mSampleRate);
    }else {
        return new com.mobileer.miditools.synth.SawVoice(mSampleRate);
    }
}