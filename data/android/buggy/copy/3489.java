public static org.dbtools.android.domain.LocalDateTime longToLocalDateTime(long l) {
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toLocalDateTime();
}