public void initEntryAndKey(long entrySize) {
    initAllocatedChunks(hh.h().inChunks(entrySize));
    entry.writeNewEntry(s.alloc(allocatedChunks), q.inputKey);
    incrementSegmentEntriesIfNeeded();
}