@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    org.eclipse.kura.web.shared.model.GwtFirewallNatEntry selection = selectionModel.getSelectedObject();
    if (selection != null) {
        initModal(selection);
    }
}