public void toggleExpanded(int index) {
    javafx.beans.property.SimpleBooleanProperty expanded = ((javafx.beans.property.SimpleBooleanProperty) (getCellObservableValue(index)));
    expanded.setValue((!(expanded.getValue())));
    getTableView().refresh();
}