private void emitNotes(int level, java.util.List<org.gedcom4j.writer.Note> notes) throws org.gedcom4j.writer.GedcomWriterException {
    for (org.gedcom4j.writer.Note n : notes) {
        emitNote(level, n);
        emitCustomTags((level + 1), n.customTags);
    }
}