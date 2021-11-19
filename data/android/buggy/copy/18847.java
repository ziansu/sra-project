public static boolean sendFriendInvite(java.lang.String username, java.lang.String invitedUser) throws java.io.IOException {
    return com.restfind.restaurantfinder.Database.checkResult(com.restfind.restaurantfinder.Database.Operation.sendFriendInvite, username, invitedUser);
}