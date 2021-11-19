@java.lang.Override
public boolean signIn(java.lang.String username, java.lang.String password) {
    if ((username == null) || (username.isEmpty()))
        return false;
    
    com.github.appreciated.quickstart.base.login.CurrentUser.set(username);
    return password.equals("Test1234!");
}