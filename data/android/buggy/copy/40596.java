public void update() {
    typeField.setText(maintenanceTypeToView.getName());
    isServiceBox.setSelected(maintenanceTypeToView.getIs_service());
}