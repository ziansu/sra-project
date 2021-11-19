@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (s != null) {
        java.lang.String name = s.toString();
        if (options.contains(name)) {
            value.value = name;
        }
    }
}