@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    db = new com.android.bpcontrol.databases.BPcontrolDB(getActivity());
    showDialog();
}