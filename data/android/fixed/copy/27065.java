public models.Entry getEntry(int entryID) {
    for (models.Entry e : this.getEntries().getEntries()) {
        if ((e.getEntryID()) == entryID) {
            return e;
        }
    }
    return null;
}