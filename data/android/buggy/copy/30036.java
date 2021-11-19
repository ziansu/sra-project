public void setStarred(boolean starred) {
    zooActivateWrite();
    setModified(true);
    this.starred = starred;
}