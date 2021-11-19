public static java.lang.String getDateTimeString(@android.support.annotation.NonNull
android.content.res.Resources resources, @android.support.annotation.NonNull
java.util.Date date) {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(resources.getString(R.string.format_date_time));
    return format.format(date);
}