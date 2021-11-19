@java.lang.Override
protected void onError(org.apache.wicket.ajax.AjaxRequestTarget target, org.apache.wicket.markup.html.form.Form<?> form) {
    super.onError(target, form);
    target.add(form);
}