@java.lang.Override
public void onBackKey() {
    com.example.kbpark.frontbeaconmonitor.LoginMain activity = ((com.example.kbpark.frontbeaconmonitor.LoginMain) (getActivity()));
    if (activity != null) {
        activity.setOnKeyBackPressedListener(null);
        activity.onBackPressed();
    }
}