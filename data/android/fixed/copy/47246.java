@java.lang.Override
public boolean verifyCredentials(java.lang.String login, java.lang.String password) {
    java.lang.String usr = "admin";
    java.lang.String psswd = "admin";
    return (usr.equals(login)) && (psswd.equals(password));
}