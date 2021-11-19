void setTableStyle(mocha.ui.TableView.Style tableStyle) {
    this.tableStyle = tableStyle;
    if ((!(this.changedSeparatorInset)) && (tableStyle == (TableView.Style.GROUPED))) {
        this.separatorInset.left = TableViewCellLayoutManager.GROUPED_INSET;
    }
}