@java.lang.Override
public void onClick(android.view.View v) {
    getFragmentManager().popBackStack();
    getActivity().setTitle(getString(R.string.app_name));
}