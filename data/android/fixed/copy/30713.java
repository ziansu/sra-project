protected void handleUiLookupByText(org.eclipse.scout.rt.ui.html.json.JsonEvent event) {
    java.lang.String searchText = event.getData().optString("searchText");
    org.eclipse.scout.rt.ui.html.json.form.fields.smartfield.JsonSmartField2.getModel().lookupByText(searchText);
}