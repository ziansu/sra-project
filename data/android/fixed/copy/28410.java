public void OpenFriendOptions() {
    appteam.app.FriendsActivity fa = ((appteam.app.FriendsActivity) (getContext()));
    fa.selected_friend = this;
    fa.OpenFriendOptTab();
}