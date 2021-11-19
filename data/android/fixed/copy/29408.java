@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    searchObservable.onNext(newText);
    return true;
}