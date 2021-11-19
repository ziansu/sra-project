@java.lang.Override
public java.lang.String createScript(domain.businessrule.BusinessRule businessRule) {
    org.stringtemplate.v4.ST template = templateBuilder.getTemplate(businessRule.getCode(), businessRule.getCodeType());
    template = businessRule.fillTemplate(template);
    return template.render();
}