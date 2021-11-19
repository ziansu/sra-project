@java.lang.Override
protected void onSubmit(org.apache.wicket.ajax.AjaxRequestTarget target, org.apache.wicket.markup.html.form.Form<?> form) {
    onRequestPerformed(target);
    com.evolveum.midpoint.web.session.SessionStorage storage = getSessionStorage();
    storage.getRoleCatalog().getAssignmentShoppingCart().clear();
}