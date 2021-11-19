private void hideAuthenticationControl(boolean hide) {
    hideControl(credentialsComposite, hide);
    authPartComposite.layout();
    authPartComposite.getParent().layout();
}