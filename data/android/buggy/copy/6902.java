private void sendUserInfo(java.lang.String name, java.lang.String pass) {
    controller.SignInController controller = this.contr;
    controller.getUserInfo(name, pass);
}