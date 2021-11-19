@java.lang.Override
public void onResume() {
    super.onResume();
    android.widget.Toast.makeText(getActivity(), "onResume called", Toast.LENGTH_SHORT).show();
    updateUI();
}