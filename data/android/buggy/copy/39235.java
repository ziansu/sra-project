@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        mGoogleApiClient.stopAutoManage(getActivity());
        mGoogleApiClient.disconnect();
    }
}