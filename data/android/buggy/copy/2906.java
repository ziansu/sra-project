public void playNote(int note, boolean accent) {
    lockMe(this);
    java.util.List<nl.zeesoft.zmmt.synthesizer.MidiNote> notes = getNotes(note, accent);
    player.playInstrumentNotes(notes);
    unlockMe(this);
}