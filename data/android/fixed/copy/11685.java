public java.lang.String[] getListOfFollowingUsernames(com.imraazrally.gitbot.model.GitUser user, int size) {
    return getUsernames(size, user.getFollowingUrl(), (-1));
}