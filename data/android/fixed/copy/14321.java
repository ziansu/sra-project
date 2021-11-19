@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new com.example.ilya.firsthomework.DateDialogFragment();
    newFragment.show(getActivity().getSupportFragmentManager(), "DatePicker");
}