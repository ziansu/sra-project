public void update(int month, int day, int year, java.util.Iterator<model.Appointment> activity) {
    this.setTableNull();
    this.setTableValues(activity);
    this.deleteBtnDisable();
}