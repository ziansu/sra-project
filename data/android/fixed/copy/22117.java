public void deploy(java.util.Map<java.lang.String, java.lang.Object> initParams) throws org.wso2.carbon.identity.workflow.mgt.exception.WorkflowException {
    org.wso2.carbon.identity.workflow.mgt.template.TemplateInitializer initializer = getInitializer();
    if (initializer != null) {
        initializer.initialize(initParams);
    }
}