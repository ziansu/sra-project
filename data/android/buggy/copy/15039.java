public boolean sentRequest(java.lang.String friendUsername) {
    if (!(user.User.dbFriendRequests.containsKey(username)))
        return false;
    
    return user.User.dbFriendRequests.get(username).contains(friendUsername);
}