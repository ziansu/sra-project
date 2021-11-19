public static void nullSafeAppend(android.widget.TextView textView, java.lang.String text) {
    if (text == null) {
        return ;
    }else {
        textView.append(text);
    }
}