private void hideAuthenticationControl(boolean hide) {
    hideControl(credentialsComposite, hide);
    authPartComposite.layout();
    authPartComposite.getParent().layout();
    this.layout();
    this.getParent().layout();
}