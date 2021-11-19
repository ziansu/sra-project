public com.github.sdarioo.testgen.generator.source.MethodTemplate with(java.lang.String variable, java.lang.String value) {
    java.lang.String newTemplate = _template.replace(variable, value);
    return new com.github.sdarioo.testgen.generator.source.MethodTemplate(newTemplate);
}