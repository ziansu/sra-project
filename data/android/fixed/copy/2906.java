public void playNote(int note, boolean accent) {
    java.util.List<nl.zeesoft.zmmt.synthesizer.MidiNote> notes = getNotes(note, accent);
    lockMe(this);
    player.playInstrumentNotes(notes);
    unlockMe(this);
}