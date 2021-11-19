public void setFiletype(int filetype) {
    if ((filetype >= (it.unica.enotes.NoteAttachment.kFileTypeMax)) || (filetype <= (it.unica.enotes.NoteAttachment.kFileTypeInvalid))) {
        this._filetype = it.unica.enotes.NoteAttachment.kFileTypeInvalid;
    }
}