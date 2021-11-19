private int getTitleResId() {
    com.pajato.android.gamechat.common.model.Account account = AccountManager.instance.getCurrentAccount();
    if (account == null)
        return R.string.app_name;
    
    if ((account.joinMap.size()) > 0)
        return R.string.GroupsToolbarTitle;
    
    return R.string.GroupMeToolbarTitle;
}