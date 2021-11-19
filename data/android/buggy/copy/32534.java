@java.lang.Override
public framework.User login(java.lang.String username, java.lang.String password) {
    framework.User user = get(username);
    if (user.getPassword().equals(password))
        return user;
    
    return null;
}