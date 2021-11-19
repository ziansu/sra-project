@java.lang.Override
public javafx.beans.value.ObservableValue<java.lang.String> call(javafx.scene.control.TreeTableColumn.CellDataFeatures<com.comino.flight.tabs.inspector.MAVInspectorTab.Dataset, java.lang.String> param) {
    return param.getValue().getValue().getValue();
}