@org.greenrobot.eventbus.Subscribe
public void onNoteUpdate(com.kikyo.note.service.NoteService.NoteUpdateContentEvent event) {
    int pos = mNotes.indexOf(event.note);
    mNotes.set(pos, event.note);
    mNoteList.getAdapter().notifyItemChanged(pos);
}