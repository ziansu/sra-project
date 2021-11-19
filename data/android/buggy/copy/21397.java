@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if (mFinishActivity) {
        android.widget.Toast.makeText(getActivity(), R.string.permission_required_toast, Toast.LENGTH_SHORT).show();
        getActivity().finish();
    }
}