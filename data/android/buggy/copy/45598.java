public static de.elomagic.calunisync.utils.LocaleDateTimeRange today() {
    return new de.elomagic.calunisync.utils.LocaleDateTimeRange(java.time.LocalDate.now().atStartOfDay(), java.time.LocalDateTime.now().plusDays(1));
}