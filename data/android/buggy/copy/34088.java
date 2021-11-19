public com.evolveum.midpoint.web.page.admin.configuration.dto.DebugSearchDto getDebugSearchDto() {
    if ((debugSearchDto) == null) {
        debugSearchDto = new com.evolveum.midpoint.web.page.admin.configuration.dto.DebugSearchDto();
        debugSearchDto.setType(ObjectTypes.SYSTEM_CONFIGURATION);
    }
    return debugSearchDto;
}