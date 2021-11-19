@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    android.util.Log.d(TAG, "OnCreateOptionsMenu");
    inflater.inflate(R.menu.fragment_landing, menu);
}