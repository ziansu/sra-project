public void removeBudgetItems() {
    blacksmyth.general.BlacksmythSwingUtilities.stopTableEditing(this);
    this.getExpenseItemTableModel().removeItems(this.getSelectedRows());
}