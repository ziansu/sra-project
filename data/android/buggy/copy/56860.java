public org.openmrs.reference.page.PersonFormPage retirePerson() {
    clickOn(org.openmrs.reference.page.PersonFormPage.RETIRE_PERSON);
    waitForTextToBePresentInElement(org.openmrs.reference.page.PersonFormPage.OPENMRS_MSG, "Person deleted");
    return new org.openmrs.reference.page.PersonFormPage(this);
}