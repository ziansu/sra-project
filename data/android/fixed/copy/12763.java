protected void updateComponents() {
    if ((scheduleManager) != null) {
        dayOffCheckBox.setChecked(scheduleManager.isDayOff());
    }
    super.updateComponents();
}