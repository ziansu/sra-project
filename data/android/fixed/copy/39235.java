@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if ((mGoogleApiClient) != null) {
        mGoogleApiClient.stopAutoManage(getActivity());
        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }
}