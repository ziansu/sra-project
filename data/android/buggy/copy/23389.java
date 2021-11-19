@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if (isAllowed(newValue)) {
        txt_sys_username.setText(newValue);
    }
}