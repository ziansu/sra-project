@java.lang.Override
public void run() {
    try {
        new gr.qpc.meteoclimaandroid.MeteoclimaMainFragment.GetLocationName(getActivity()).execute();
    } catch (java.lang.Exception e) {
    }
}