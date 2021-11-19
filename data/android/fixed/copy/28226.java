@java.lang.Override
@com.wordnik.swagger.annotations.ApiOperation(value = com.sequenceiq.cloudbreak.doc.OperationDescriptions.TemplateOpDescription.GET_PUBLIC_BY_NAME, produces = com.sequenceiq.cloudbreak.doc.ContentType.JSON, notes = com.sequenceiq.cloudbreak.doc.Notes.TEMPLATE_NOTES)
public com.sequenceiq.cloudbreak.model.TemplateResponse getPublic(@org.springframework.web.bind.annotation.PathVariable
java.lang.String name) {
    com.sequenceiq.cloudbreak.domain.CbUser user = authenticatedUserService.getCbUser();
    com.sequenceiq.cloudbreak.logger.MDCBuilder.buildUserMdcContext(user);
    com.sequenceiq.cloudbreak.domain.Template template = templateService.getPublicTemplate(name, user);
    return convert(template);
}