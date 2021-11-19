@java.lang.Override
public void onCaldroidViewCreated() {
    if ((caldroidFragment.getLeftArrowButton()) != null) {
        android.widget.Toast.makeText(getActivity().getApplicationContext(), "Caldroid view is created", Toast.LENGTH_SHORT).show();
    }
}