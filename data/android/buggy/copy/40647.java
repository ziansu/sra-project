private void requestContacts(java.lang.String user) {
    java.util.List<com.medicineprof.registration.model.Contact> contacts = getContactList();
    com.medicineprof.registration.service.RegistrationServiceHelper.getInstance(getApplicationContext()).requestContacts(user, "", contacts);
}