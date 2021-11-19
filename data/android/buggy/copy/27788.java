@java.lang.Override
public boolean registerNewUser(java.lang.String login, java.lang.String password) {
    return !(login.equals("admin"));
}