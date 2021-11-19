public void doLogin(com.extjs.gxt.ui.client.event.EventType eventOnSuccess, java.lang.String loadingMessage) {
    this.eventOnSuccess = eventOnSuccess;
    this.showProgressBar(loadingMessage);
    BasicGinInjector.MainInjector.getInstance().getSecurityLoginChainOfResponsibility().doLogin();
}