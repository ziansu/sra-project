@butterknife.OnClick(value = R.id.tv_event_invite)
public void eventInvite() {
    mParent.isEventClicked = true;
    com.zhour.utils.Utility.showLog("isEventClicked", ("isEventClicked" + (mParent.isEventClicked)));
    eventInviteHideLogic();
    getInviteTypes("Event%20Types");
}