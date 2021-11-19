@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    ((com.anjoola.sharewear.ContactsAllFragment) (mFragment)).mAdapter.getFilter().filter(newText);
    return true;
}