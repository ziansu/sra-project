public static void nullSafeAppend(android.widget.TextView textView, java.lang.String text) {
    if (text != null) {
        textView.append(text);
    }
}