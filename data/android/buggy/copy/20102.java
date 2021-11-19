public void unfriendUser(final java.lang.String hostId, final com.android.summer.csula.foodvoter.models.User friend) {
    friendshipRef.child(friend.getId()).removeValue();
}