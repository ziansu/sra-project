public boolean isOverdue() {
    return (!(isCompleted())) && (getStartElseEndDate().isBefore(java.time.LocalDateTime.now()));
}