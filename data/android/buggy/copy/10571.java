@java.lang.Override
protected void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    super.onClick(target);
    tree.select(lemming.ui.tree.GenericFolder.getModelObject());
}