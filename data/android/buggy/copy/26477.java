protected void initStatus() {
    resultLimitFromHelp.setEnabled(org.talend.designer.core.DesignerPlugin.getDefault().getPreferenceStore().getBoolean(TalendDesignerPrefConstants.PALETTE_SETTINGS_SEARCH_FROM_HELP), getFieldEditorParent());
}