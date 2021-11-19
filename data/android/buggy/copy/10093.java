private boolean isExistingNote(int note_id) {
    if (note_id < 0)
        return false;
    
    if (note_id > (noteData.capacity()))
        return false;
    
    return true;
}