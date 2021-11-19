@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if ((query.length()) > 0)
        presenter.loadCharacters(query);
    else
        presenter.loadCharacters();
    
    pbCharacters.setVisibility(View.VISIBLE);
    return false;
}