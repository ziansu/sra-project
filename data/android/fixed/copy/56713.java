@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(currentQuery.equalsIgnoreCase(s.toString()))) {
        currentQuery = s.toString();
        notifySearchQueryChanged(currentQuery);
    }
}