@java.lang.Override
public void loginSuccessful() {
    java.lang.System.out.println("login successful");
    setContent(viewContainer);
    navigator.navigateTo(navigator.getState());
}