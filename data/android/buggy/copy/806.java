public boolean hasMatchStarted() {
    java.time.LocalDateTime kickOffLocalDateTime = de.fred4jupiter.fredbet.util.DateUtils.toLocalDateTime(kickOffDate);
    return java.time.LocalDateTime.now().isAfter(kickOffLocalDateTime);
}