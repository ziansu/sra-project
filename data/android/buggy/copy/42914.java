protected void onUpdateError(org.apache.wicket.ajax.AjaxRequestTarget target, java.lang.Exception ex) {
    java.lang.String message = "Error occurred while fetching data: " + (ex.getMessage());
    org.apache.wicket.markup.html.basic.Label errorLabel = new org.apache.wicket.markup.html.basic.Label(com.evolveum.midpoint.web.component.AsyncUpdatePanel.ID_BODY, message);
    replace(errorLabel);
    target.add(this);
}