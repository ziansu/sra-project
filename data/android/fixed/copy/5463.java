@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Number> observableValue, java.lang.Number oldSceneHeight, java.lang.Number newSceneHeight) {
    secondaryStage.setFullScreen(false);
    secondaryStage.setFullScreen(true);
}