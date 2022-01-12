@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onEvent(java.util.List<com.sharesmile.share.rfac.models.CauseData> causeDataList) {
    if (isVisible()) {
        com.sharesmile.share.rfac.models.CauseList causeList = new com.sharesmile.share.rfac.models.CauseList();
        causeList.setCauses(causeDataList);
        setCausedata(causeList);
    }
}