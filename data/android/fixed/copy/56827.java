@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    updateSortingCriteriaPreference(i);
    updateMovies();
}