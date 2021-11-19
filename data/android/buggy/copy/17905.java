protected final void addEntryAfter(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntry entry, final org.bonitasoft.web.toolkit.client.ui.JsId jsid) {
    getLastContainer().append(entry);
    this.entriesIndex.put(entry.getJsId().toString(), entry);
}