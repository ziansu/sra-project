@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (isClosedOrder())
        return false;
    
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_order, menu);
    return true;
}