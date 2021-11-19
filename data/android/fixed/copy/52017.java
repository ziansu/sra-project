private void assurePlayerInit() {
    if ((mPlayer) == null) {
        mPlayer = com.google.samples.apps.topeka.helper.PreferencesHelper.getPlayer(getActivity());
    }
}