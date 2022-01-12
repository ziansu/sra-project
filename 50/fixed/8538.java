public void onClickSetPathUp(android.view.View view) {
    if (((mProfileService) != null) && ((mProfileService.getMapClient(mMasInstanceId)) != null)) {
        mProfileService.getMapClient(mMasInstanceId).setFolderUp();
        goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
    }
}