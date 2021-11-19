protected org.bonitasoft.web.toolkit.client.ui.component.containers.Container<org.bonitasoft.web.toolkit.client.ui.component.form.FormNode> getLastContainer() {
    if ((containers.size()) == 0) {
        containers.push(new org.bonitasoft.web.toolkit.client.ui.component.form.entry.Section());
    }
    return containers.lastElement();
}