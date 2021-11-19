public boolean canModifyTemplates() {
    if (isEditResource()) {
        return templateEditor.hasPermissionToModifyResourceTemplate(resourceId, settings.isTestingMode());
    }
    return templateEditor.hasPermissionToModifyResourceTypeTemplate(resourceTypeId, settings.isTestingMode());
}