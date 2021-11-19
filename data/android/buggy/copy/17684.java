@java.lang.Override
public void validate() throws command.ValidateException {
    validateUserAndPassword(username, MaxLength.USERNAME, "Username/Password");
    validateUserAndPassword(password, MaxLength.PASSWORD, "Username/Password");
}