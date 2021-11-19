public void followUser(codeu.chat.common.User userA, codeu.chat.common.User userB) {
    codeu.chat.common.User user1 = userById().first(userA.id);
    codeu.chat.common.User user2 = userById().first(userB.id);
    codeu.chat.common.User.follow(user1, user2);
}