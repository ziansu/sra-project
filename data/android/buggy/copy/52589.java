private br.com.mvbos.etag.ui.EtagTextPane getSelected() {
    int sel = tabbedPane.getSelectedIndex();
    return editors.get(sel);
}