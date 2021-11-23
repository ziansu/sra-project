@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.add :
            {
                setDate();
            }
            break;
    }
    return true;
}