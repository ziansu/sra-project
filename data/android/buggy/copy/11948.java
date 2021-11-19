@java.lang.Override
public java.util.List<services.Template> getAllTemplates() throws serviceerrors.InternalErrorException {
    java.util.List<services.Template> templateList = readTemplateList();
    return templateList;
}