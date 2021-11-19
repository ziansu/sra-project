@java.lang.Override
public boolean checkIfExists(java.lang.String login) {
    if (login == null)
        return false;
    
    return login.equals("admin");
}