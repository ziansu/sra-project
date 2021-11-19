@java.lang.Override
public void onResume() {
    super.onResume();
    helpers.GooglePlayHelper.isPlayServiceAvailable(getActivity());
}