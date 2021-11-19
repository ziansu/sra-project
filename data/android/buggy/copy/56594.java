private void onTextChanged(java.lang.CharSequence newText) {
    suggestionsListChanged();
    if (!(android.text.TextUtils.isEmpty(searchEditText.getText()))) {
        displayClearButton(true);
    }else {
        displayClearButton(false);
    }
}