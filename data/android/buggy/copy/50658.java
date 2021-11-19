public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent myIntent = new android.content.Intent(getApplicationContext(), no.teacherspet.mainapplication.RoleSelect.class);
    startActivityForResult(myIntent, 0);
    finish();
    return true;
}