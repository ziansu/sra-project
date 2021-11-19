public boolean isOverdue() {
    if ((getStartElseEndDate()) == null) {
        return false;
    }
    return (!(isCompleted())) && (getStartElseEndDate().isBefore(java.time.LocalDateTime.now()));
}