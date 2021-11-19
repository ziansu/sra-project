@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    onTagTextEntryListener.onTextEntry(this, s.toString());
}