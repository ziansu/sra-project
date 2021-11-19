@java.lang.Override
public void onClick(org.apache.wicket.ajax.AjaxRequestTarget target, org.apache.wicket.model.IModel<com.evolveum.midpoint.web.page.admin.server.TaskDto> rowModel) {
    com.evolveum.midpoint.web.page.admin.server.TaskDto task = rowModel.getObject();
    taskDetailsPerformed(target, task.getOid());
}