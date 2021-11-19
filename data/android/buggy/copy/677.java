public void onDestroy() {
    super.onDestroy();
    Common.Receiver = false;
    unbindService(rConnection);
}