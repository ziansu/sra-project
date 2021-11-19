@java.lang.Override
public void setEditAllowed(boolean editAllowed) {
    if (((_labelField) != null) && (controlState(_labelField))) {
        _labelField.setEnabled(editAllowed);
    }
}