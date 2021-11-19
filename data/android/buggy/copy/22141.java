@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Tab> observable, javafx.scene.control.Tab oldValue, javafx.scene.control.Tab newValue) {
    java.lang.System.out.println(oldValue.getText());
    java.lang.System.out.println(newValue.getText());
    setCurrentTaskListAndListView(newValue.getText());
}