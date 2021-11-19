@java.lang.Override
public void checkCurrentSession() {
    if (!(sessionInteractor.isValidSession())) {
        view.navigateToLoginScreen();
    }else {
        userInteractor.getUser(sessionInteractor.getSession());
    }
}