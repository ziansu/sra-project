@java.lang.Override
public void reloadListFragment() {
    final org.openbmap.activities.SessionListFragment sessionFrag = ((org.openbmap.activities.SessionListFragment) (getSupportFragmentManager().findFragmentByTag("session")));
    if (sessionFrag != null) {
        sessionFrag.refreshAdapter();
    }
}