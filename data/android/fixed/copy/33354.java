@java.lang.Override
public boolean localUserExists() throws com.melanie.support.exceptions.MelanieBusinessException {
    boolean userExists = false;
    userExists = (getLocalUser()) != null;
    return userExists;
}