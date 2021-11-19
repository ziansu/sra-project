public void initEntryAndKeyCopying(long entrySize, long bytesToCopy) {
    initAllocatedChunks(hh.h().inChunks(entrySize));
    entry.copyExistingEntry(s.alloc(allocatedChunks), bytesToCopy);
    incrementSegmentEntriesIfNeeded();
}