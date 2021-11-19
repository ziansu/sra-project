public long getLastLogTerm() {
    long lastLogIndex = this.getLastLogIndex();
    if (lastLogIndex == 0) {
        return 0;
    }
    return this.getEntry(lastLogIndex).getTerm();
}