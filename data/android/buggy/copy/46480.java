@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    adapter.filter(s.toString());
    addFooterHandler(s.toString());
}