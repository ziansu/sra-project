@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    de.jochen_manns.buyitv0.ListActivity.getMenuInflater().inflate(m_menu, menu);
    android.view.MenuItem newItem = menu.findItem(R.id.action_new);
    newItem.setTitle(R.string.action_new);
    return true;
}