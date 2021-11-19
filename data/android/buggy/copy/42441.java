public void onRemoveClicked(android.view.View view) {
    cbpos1989.com.sqlitedatabase.DBHandler dbHandler = new cbpos1989.com.sqlitedatabase.DBHandler(getApplicationContext());
    dbHandler.removePerson(person.getId());
    setResult(1);
    finish();
}