@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent event) {
    org.eclipse.core.resources.WorkspaceJob updateGroups = new sernet.verinice.rcp.accountgroup.AccountGroupView.UpdateGroupsJob(sernet.gs.ui.rcp.main.bsi.views.Messages.GroupView_13, event);
    sernet.verinice.iso27k.rcp.JobScheduler.scheduleInitJob(updateGroups);
}