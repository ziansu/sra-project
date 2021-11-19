@java.lang.Override
public void callback() {
    if (progress != null) {
        progress.dismiss();
    }
    getActivity().finish();
}