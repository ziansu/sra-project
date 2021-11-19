public static long localDateTimeToLong(@javax.annotation.Nonnull
org.dbtools.android.domain.LocalDateTime d) {
    return d.atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toInstant().toEpochMilli();
}