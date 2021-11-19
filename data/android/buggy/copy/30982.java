@java.lang.Override
public void dataModelChanged(gov.ornl.eden.DataModel dataModel) {
    fireTableStructureChanged();
    gov.ornl.eden.DataTableModel.log.debug("dataModelChanged() in DataTableModel");
}