public void initEntryAndKeyCopying(long entrySize, long bytesToCopy) {
    initAllocatedChunks(hh.h().inChunks(entrySize));
    incrementSegmentEntriesIfNeeded();
    entry.copyExistingEntry(s.alloc(allocatedChunks), bytesToCopy);
}