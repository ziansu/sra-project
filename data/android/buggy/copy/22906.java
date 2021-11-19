protected void activate(org.osgi.service.component.ComponentContext context) {
    org.osgi.framework.BundleContext bundleContext = context.getBundleContext();
    mdmServiceRegistration = bundleContext.registerService(org.wso2.carbon.appmgt.mdm.wso2mdm.MDMOperations.class.getName(), new org.wso2.carbon.appmgt.mdm.wso2mdm.MDMOperations(), context.getProperties());
    org.wso2.carbon.appmgt.mdm.wso2mdm.internal.MDMComponent.log.debug("WSO2 MDM Service Registration activated");
}