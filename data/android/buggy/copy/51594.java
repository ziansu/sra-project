@java.lang.Override
public boolean validateText(java.lang.String val) {
    if (super.validateText(val)) {
        if (this.subgridPanel.isValidSubGrid()) {
            this.subgridPanel.checkUseFullGrid();
            return true;
        }
    }
    return false;
}