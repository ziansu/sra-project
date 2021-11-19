@java.lang.Override
public boolean onCreateOptionsMenu(android.app.Activity a, android.view.Menu m) {
    menu = m;
    if ((size()) > 0) {
        return generateMenu();
    }
    return false;
}