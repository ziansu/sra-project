private void setAppointmentStatus() {
    if (selectedAppointment.isEditable()) {
        calendarView.setAppointmentStatus("Owned");
    }else {
        calendarView.setAppointmentStatus(selectedAppointment.getStatus());
    }
}