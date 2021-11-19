@java.lang.Override
public java.util.List<org.motechproject.dhis2.rest.domain.DataElementDto> getDataElements() {
    return getResources(org.motechproject.dhis2.rest.service.impl.DhisWebServiceImpl.DATA_ELEMENTS, org.motechproject.dhis2.rest.domain.DataElementDto.class);
}