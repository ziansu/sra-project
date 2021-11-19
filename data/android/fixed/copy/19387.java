@butterknife.OnClick(value = R.id.tv_event_invite)
public void eventInvite() {
    eventInviteHideLogic();
    getInviteTypes("Event%20Types");
}