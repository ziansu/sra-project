public void initTasksList(android.content.Intent intent) {
    android.support.v4.app.Fragment f = checkFragmentInstance(R.id.fragment_container, net.fred.taskgame.fragment.ListFragment.class);
    if (f != null) {
        ((net.fred.taskgame.fragment.ListFragment) (f)).initTasksList(intent);
    }
}