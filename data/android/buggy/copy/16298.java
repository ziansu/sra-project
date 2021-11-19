@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((mainTable.table.getSelectedRow()) != (-1)) {
        mainTable.defaultTable.removeRow(mainTable.table.getSelectedRow());
        newList.record.remove(mainTable.table.getSelectedRow());
    }
}