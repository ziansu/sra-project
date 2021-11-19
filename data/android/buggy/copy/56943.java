protected org.bonitasoft.web.toolkit.client.ui.component.containers.Container<org.bonitasoft.web.toolkit.client.ui.component.form.FormNode> getLastContainer() {
    if ((this.containers.size()) == 0) {
        this.containers.push(new org.bonitasoft.web.toolkit.client.ui.component.form.entry.Section());
    }
    return this.containers.lastElement();
}