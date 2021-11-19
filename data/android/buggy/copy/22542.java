public void setDeleted(boolean deleted) {
    isDeleted = deleted;
    setLastUpdatedAt(java.time.LocalDateTime.now());
}