@android.support.annotation.NonNull
public static java.lang.String getString(@android.support.annotation.NonNull
android.widget.EditText edit, @android.support.annotation.NonNull
java.lang.String defaultValue) {
    final java.lang.String text = edit.getText().toString();
    if (text.isEmpty()) {
        return defaultValue;
    }
    return text;
}