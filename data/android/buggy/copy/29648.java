protected static org.hisp.dhis.validation.notification.ValidationNotificationTemplate createValidationNotificationTemplate(java.lang.String name) {
    org.hisp.dhis.validation.notification.ValidationNotificationTemplate template = new org.hisp.dhis.validation.notification.ValidationNotificationTemplate();
    template.setName(name);
    template.setSubjectTemplate("Subject");
    template.setMessageTemplate("Message");
    template.setNotificationRecipient(ValidationNotificationRecipient.ORGANISATION_UNIT_CONTACT);
    return template;
}