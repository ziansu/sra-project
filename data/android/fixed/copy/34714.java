@java.lang.Override
public void loginSuccessful() {
    setContent(viewContainer);
    navigator.navigateTo(navigator.getState());
}