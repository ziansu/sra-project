@java.lang.Override
public boolean isUsernameAvailable(java.lang.String username) {
    return (this.getUserByName(username)) != null;
}