public boolean hasNonStaticEntry() {
    for (final org.bonitasoft.web.toolkit.client.ui.component.form.entry.ValuedFormEntry entry : this.entriesIndex.values()) {
        if (!(entry instanceof org.bonitasoft.web.toolkit.client.ui.component.form.entry.StaticText)) {
            return true;
        }
    }
    return false;
}