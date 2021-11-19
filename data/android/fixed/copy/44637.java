public void goToCorrectWelcomeView() {
    if (service.noUsersExist()) {
        setContent(context.getBean(com.teamlans.lepta.view.account.SignUpView.class));
    }else {
        setContent(context.getBean(com.teamlans.lepta.view.account.LoginView.class));
    }
}