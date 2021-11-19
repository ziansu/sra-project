public void onResume() {
    super.onResume();
    getActivity().setProgressBarIndeterminateVisibility(true);
    refreshNotes();
}