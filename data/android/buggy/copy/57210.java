@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.options_menu, menu);
    menu.removeItem(R.id.item_goto_move);
    return true;
}