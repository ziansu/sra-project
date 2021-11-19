@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (editable.toString().trim().isEmpty()) {
        return ;
    }
    homePresenter.getPageSuggestions(searchEdittext.getText().toString());
}