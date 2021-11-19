public static long dateTimeToLongUtc(@javax.annotation.Nonnull
org.joda.time.DateTime d) {
    return d.withZone(DateTimeZone.UTC).getMillis();
}