public void addUser(com.viavansi.vaadinsample.models.User user) {
    user.setId(((users.size()) + 1));
    users.add(user);
}