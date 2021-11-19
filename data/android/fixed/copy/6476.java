public boolean hasMatchStarted() {
    return java.time.LocalDateTime.now().isAfter(getKickOffDate());
}