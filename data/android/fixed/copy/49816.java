public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((tglbtnRightDoors.isSelected()) && ((current) == 0)) {
        txtRightDoors.setText("Open");
    }else {
        txtRightDoors.setText("Closed");
    }
}