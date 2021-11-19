@java.lang.Override
public void run() {
    mAdapter.notifyDataSetChanged();
    android.widget.Toast.makeText(getActivity(), "Refresh complete", Toast.LENGTH_SHORT).show();
}