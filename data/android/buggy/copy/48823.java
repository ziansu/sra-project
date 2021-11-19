private void AddUser(UserProfile user) {
    user.NextUser = first;
    first = user;
}