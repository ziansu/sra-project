@java.lang.Override
public void removeNote(int startBeat, cs3500.music.view2.Playable note) {
    this.m.deleteNote(note.getPitch(), startBeat);
}