private com.fasterxml.jackson.databind.node.ObjectNode processTPropertiesWidget(org.talend.daikon.properties.Properties cProperties, java.lang.String formName) {
    org.talend.daikon.properties.presentation.Form mainForm = cProperties.getPreferredForm(formName);
    org.talend.daikon.properties.presentation.Form advancedForm = cProperties.getPreferredForm(Form.ADVANCED);
    return processTPropertiesWidget(mainForm, advancedForm);
}