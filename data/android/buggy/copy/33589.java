public static java.lang.String getSeparatorTime(@android.support.annotation.Nullable
android.content.res.Resources resources, org.threeten.bp.LocalDateTime now, org.threeten.bp.LocalDateTime then, boolean is24HourFormat, org.threeten.bp.ZoneId timeZone, boolean epocIsJustNow) {
    return com.waz.zclient.utils.ZTimeFormatter.getSeparatorTime(resources, now, then, is24HourFormat, timeZone, epocIsJustNow, true);
}