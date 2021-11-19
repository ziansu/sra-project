@java.lang.Override
public void onResume() {
    super.onResume();
    com.example.tiferet.rebook.MainActivity activity = ((com.example.tiferet.rebook.MainActivity) (getActivity()));
    activity.menuIdToDisplay = R.menu.menu_add_book;
    activity.invalidateOptionsMenu();
}