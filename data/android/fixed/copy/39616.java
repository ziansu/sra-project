public static void nullSafeAppend(android.widget.TextView textView, java.util.Date date, java.text.DateFormat dateFormat) {
    if (date != null) {
        textView.append(dateFormat.format(date));
    }
}