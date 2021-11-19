@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().registerReceiver(mScanResultsReceiver, new android.content.IntentFilter(android.net.wifi.WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
}