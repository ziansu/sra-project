public void onDestroy() {
    super.onDestroy();
    if (Common.Receiver) {
        unbindService(rConnection);
    }
}