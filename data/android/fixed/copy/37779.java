public void setNotes(java.lang.String notes) {
    if ((notes.length()) >= (MAX_LENGTH)) {
        mNotes = notes.substring(0, MAX_LENGTH);
    }else {
        mNotes = notes;
    }
}