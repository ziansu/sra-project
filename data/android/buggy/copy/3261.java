@java.lang.Override
public void tabActivated(org.sigmah.client.ui.widget.tab.TabBar bar, org.sigmah.client.ui.widget.tab.Tab tab) {
    com.google.gwt.user.client.Window.alert("Activating tab!");
    eventBus.navigateRequest(requests.get(tab.getId()));
}