private void CreateUI() {
    com.vaadin.server.VaadinSession.getCurrent().getSession().setMaxInactiveInterval(300);
    rootLayout.addComponent(getTopBar());
    rootLayout.addComponent(getSheetLayout());
}