@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add :
            listener.onAddPokemonClick();
            return true;
        case android.R.id.home :
            android.util.Log.e("ANDROID", "LE ARROW PRESSED");
        default :
            return false;
    }
}