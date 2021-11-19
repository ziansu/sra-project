void setupSingleTrack(java.io.InputStream is) throws com.jhindin.midi.parsing.MidiException, java.io.IOException {
    tracks = new com.jhindin.midi.parsing.MidiContext.Track[1];
    tracks[0] = new com.jhindin.midi.parsing.MidiContext.Track(0, com.jhindin.midi.parsing.StreamChunk.getChunk(is));
}