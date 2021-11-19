@java.lang.Override
public boolean onCreateOptionsMenu(android.app.Activity a, android.view.Menu m) {
    menu = m;
    generateMenu();
    return (size()) > 0;
}