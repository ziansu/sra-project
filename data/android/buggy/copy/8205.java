@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    homePresenter.getPageSuggestions(searchEdittext.getText().toString());
}