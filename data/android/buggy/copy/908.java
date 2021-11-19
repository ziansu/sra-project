@java.lang.Override
public int getColumnCount() {
    gov.ornl.eden.DataTableModel.log.debug(("column count is " + (dataModel.getColumnCount())));
    return dataModel.getColumnCount();
}