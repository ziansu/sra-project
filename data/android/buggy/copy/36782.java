private void startNewServerFlow() {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.page_container, treehou.se.habit.ui.settings.SetupServerFragment.newInstance()).addToBackStack(null).commit();
}