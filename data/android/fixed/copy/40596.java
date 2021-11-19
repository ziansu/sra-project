public void update() {
    if ((maintenanceTypeToView) != null) {
        typeField.setText(maintenanceTypeToView.getName());
        isServiceBox.setSelected(maintenanceTypeToView.getIs_service());
    }
}