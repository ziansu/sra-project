@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int selectedGU = tableSample.getSelectedRow();
    if (selectedGU != (-1)) {
        dialog.dispose();
        name = goldenUnitsList.remove(selectedGU);
    }
}