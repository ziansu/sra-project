public ntut.csie.ezScrum.web.dataObject.StoryObject setNotes(java.lang.String notes) {
    mNotes = handleSpecialChar(notes);
    return this;
}