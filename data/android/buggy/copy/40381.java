private java.lang.String key(freemarker.template.TemplateModel key) throws freemarker.template.TemplateModelException {
    if (key == null)
        return null;
    
    return ((freemarker.template.TemplateScalarModel) (key)).getAsString();
}