public void goToCorrectWelcomeView() {
    if (service.noUsersExist()) {
        getUI().setContent(context.getBean(com.teamlans.lepta.view.account.SignUpView.class));
    }else {
        getUI().setContent(context.getBean(com.teamlans.lepta.view.account.LoginView.class));
    }
}