public java.lang.Boolean getRegistrationNumberNotEmptyAndNotResearch() {
    return (!(registrationNumber.isEmpty())) && (!(org.innovateuk.ifs.user.resource.OrganisationTypeEnum.isResearch(organisationTypeId)));
}