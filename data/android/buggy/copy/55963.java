private void onClickDisconnect() {
    mProfileService.getMapClient(mMasInstanceId).disconnect();
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.DISCONNECT);
}