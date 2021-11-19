@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((mainTable.table.getSelectedRow()) != (-1)) {
        newList.record.remove(mainTable.table.getSelectedRow());
        mainTable.defaultTable.removeRow(mainTable.table.getSelectedRow());
    }
}