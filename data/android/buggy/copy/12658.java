private void wifiStateChanged(int state) {
    switch (state) {
        case JxWifiManager.STATE_ENABLED :
            mContentView.setVisibility(View.VISIBLE);
            break;
        case JxWifiManager.STATE_DISABLED :
            mContentView.setVisibility(View.INVISIBLE);
            break;
    }
}