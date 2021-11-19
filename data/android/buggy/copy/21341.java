@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    closeFragment();
}