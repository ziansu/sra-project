@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("gets called", "gets called");
    getActivity().setTitle(this.notebookName);
    refreshNotes();
}