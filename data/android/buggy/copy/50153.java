@java.lang.Override
public void onStop() {
    getActivity().getActionBar().setDisplayHomeAsUpEnabled(false);
    saveSettings();
    super.onStop();
}