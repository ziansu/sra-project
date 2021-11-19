public void refreshListAppointment() {
    appointments = manageAppointmentsService.list(sessionController.getCurrentUser());
}