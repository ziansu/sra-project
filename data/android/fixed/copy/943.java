private void initFields() {
    title = getString(R.string.settings_title);
    user = com.quickblox.q_municate_core.utils.UserFriendUtils.createLocalUser(com.quickblox.q_municate_core.models.AppSession.getSession().getUser());
    facebookHelper = new com.quickblox.q_municate.utils.helpers.FacebookHelper(this);
    twitterDigitsHelper = new com.quickblox.q_municate.utils.helpers.TwitterDigitsHelper();
}