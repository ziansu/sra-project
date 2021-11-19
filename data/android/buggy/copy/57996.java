@java.lang.Override
public void run() {
    handler.post(new java.lang.Runnable() {
        public void run() {
            try {
                new gr.qpc.meteoclimaandroid.MeteoclimaMainFragment.GetLocationName(getActivity()).execute();
            } catch (java.lang.Exception e) {
            }
        }
    });
}