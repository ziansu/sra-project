@org.zkoss.zk.ui.select.annotation.Listen(value = "onClick=#register")
public void onRegister() {
    pushAppEvent(AppEvts.ON_CLOSE_BOOK);
    pushAppEvent(AppEvts.ON_REGISTER);
}