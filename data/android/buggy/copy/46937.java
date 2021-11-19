@java.lang.Override
public void onPersonAdded(com.djonique.birdays.models.Person person) {
    pagerAdapter.addPerson(person);
    android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(findViewById(R.id.container), R.string.record_added, Snackbar.LENGTH_SHORT);
    snackbar.show();
}