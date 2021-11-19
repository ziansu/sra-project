public void update(java.util.Iterator<model.Appointment> activity) {
    this.setTableNull();
    this.setTableValues(activity);
    this.deleteBtnDisable();
}