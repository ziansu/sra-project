private void showNetworkError() {
    hideAllInterfaceElements();
    android.support.v4.app.DialogFragment networkErrorFragment = new com.arjanvlek.cyngnotainfo.views.NetworkErrorFragment();
    networkErrorFragment.show(getFragmentManager(), "NetworkError");
}