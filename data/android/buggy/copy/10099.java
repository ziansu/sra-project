@java.lang.Override
public javafx.beans.value.ObservableValue<java.lang.Number> call(javafx.scene.control.TreeTableColumn.CellDataFeatures<com.comino.flight.tabs.inspector.MAVInspectorTab.Dataset, java.lang.Number> param) {
    return param.getValue().getValue().noProperty();
}