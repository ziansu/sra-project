public static de.elomagic.calunisync.utils.LocaleDateTimeRange today() {
    return new de.elomagic.calunisync.utils.LocaleDateTimeRange(java.time.LocalDate.now().atStartOfDay(), java.time.LocalDate.now().plusDays(1).atStartOfDay());
}