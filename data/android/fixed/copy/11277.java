@java.lang.Override
public void onResume() {
    super.onResume();
    mUsername = com.niemisami.wedu.settings.WeduPreferenceHelper.getUsername(getActivity());
    createSocketListeners();
}