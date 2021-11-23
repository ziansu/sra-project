@java.lang.Override
public void logOut() {
    sessionStorageService.clear();
    userStorageService.clear();
}