@java.lang.Override
public void connectServerFail() {
    progressPost.setVisibility(View.GONE);
    com.hbbsolution.maid.utils.ShowAlertDialog.showAlert(getResources().getString(R.string.connection_error), getActivity());
}