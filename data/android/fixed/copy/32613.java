public simplechat.User searchIpByName(java.lang.String targetUser) {
    if ((mapUserIp.get(targetUser)) != null) {
        return new simplechat.User(targetUser, mapUserIp.get(targetUser));
    }
    return null;
}