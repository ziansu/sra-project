@java.lang.Override
public boolean localUserExists() throws com.melanie.support.exceptions.MelanieBusinessException {
    boolean userExists = false;
    try {
        userExists = (getLocalUser()) != null;
    } catch (com.melanie.support.exceptions.MelanieDataLayerException e) {
        throw new com.melanie.support.exceptions.MelanieBusinessException(e.getMessage(), e);
    }
    return userExists;
}