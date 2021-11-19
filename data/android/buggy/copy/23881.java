public void stopNote(int note) {
    lockMe(this);
    java.util.List<nl.zeesoft.zmmt.synthesizer.MidiNote> notes = getNotes(note, false);
    player.stopInstrumentNotes(notes);
    unlockMe(this);
}