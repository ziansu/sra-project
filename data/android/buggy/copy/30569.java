@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    this.menu = menu;
    if (!(showTick))
        menu.getItem(0).setEnabled(false);
    else
        menu.getItem(0).setEnabled(true);
    
}