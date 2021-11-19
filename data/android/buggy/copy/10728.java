public void follow(int followerId, int followeeId) {
    setUpUser(followeeId);
    userToFollowee.get(followerId).add(followeeId);
}