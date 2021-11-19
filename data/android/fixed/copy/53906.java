protected java.lang.String getTagEditorValue(java.lang.String key) {
    org.openstreetmap.josm.gui.tagging.TagModel tag = pnlTagEditor.getModel().get(key);
    return tag == null ? null : tag.getValue();
}