protected boolean hasMore() {
    return (reader.getFilePointer()) < (split.getEnd());
}