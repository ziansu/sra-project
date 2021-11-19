private void endOnStart() {
    startupSource = 0;
    sk.henrichg.phoneprofiles.GlobalData.setApplicationStarted(getActivity().getBaseContext(), true);
}