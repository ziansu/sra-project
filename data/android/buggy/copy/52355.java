@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    setCitiesList(newText);
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    return true;
}