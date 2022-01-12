public void addAppointment(com.zyumbik.makeanappointment.data_models.AppointmentData appointment) {
    dates.add(appointment.getTimeInMillis());
    addresses.add(appointment.getOffice().toString());
}