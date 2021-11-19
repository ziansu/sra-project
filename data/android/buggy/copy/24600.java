@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(newText.isEmpty())) {
        search(newText);
    }
    return false;
}