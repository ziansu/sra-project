@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_activity_actions, menu);
    boolean bool = super.onCreateOptionsMenu(menu);
    return bool;
}