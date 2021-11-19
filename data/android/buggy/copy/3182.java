public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    removeYearsFromMeasurementTable(2013, 2013);
    filterTable.removeFilterFromTable(city);
    measurementTable.clearMeasurementTable();
}