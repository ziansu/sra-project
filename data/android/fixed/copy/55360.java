public void addWebBundleDescriptor(org.glassfish.web.deployment.descriptor.WebBundleDescriptor webBundleDescriptor) {
    getWelcomeFilesSet().addAll(webBundleDescriptor.getWelcomeFilesSet());
    addCommonWebBundleDescriptor(webBundleDescriptor, false);
}