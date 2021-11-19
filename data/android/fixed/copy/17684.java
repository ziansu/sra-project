@java.lang.Override
public void validate() throws command.ValidateException {
    validateUserAndPassword(username, MaxLength.USERNAME);
    validateUserAndPassword(password, MaxLength.PASSWORD);
}