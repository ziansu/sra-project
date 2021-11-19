@java.lang.Override
public void changed(final javafx.beans.value.ObservableValue<? extends java.lang.String> observable, final java.lang.String oldValue, final java.lang.String newValue) {
    refreshInputErrors();
    if (oldValue != newValue) {
        currentValue = newValue;
    }
}