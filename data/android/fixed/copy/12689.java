@javax.annotation.Nullable
public static java.lang.Long dateTimeToLongUtc(@javax.annotation.Nullable
org.joda.time.DateTime d) {
    if (d == null) {
        return null;
    }
    return d.withZone(DateTimeZone.UTC).getMillis();
}