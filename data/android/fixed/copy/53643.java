@java.lang.Override
public void checkExit(int status) {
    if ((!(exitPermission)) && (!(checkForSecureAccess()))) {
        throw getException("exit");
    }
}