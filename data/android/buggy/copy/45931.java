@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if ((menu.size()) == 2) {
        inflater.inflate(R.menu.menu_favourite, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}