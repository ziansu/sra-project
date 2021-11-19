@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((onTagTextEntryListener) != null)
        onTagTextEntryListener.onTextEntry(this, s.toString());
    
}