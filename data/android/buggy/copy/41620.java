public void addDefaultWebBundleDescriptor(org.glassfish.web.deployment.descriptor.WebBundleDescriptor webBundleDescriptor) {
    if ((getWelcomeFilesSet().size()) == 0) {
        getWelcomeFilesSet().addAll(webBundleDescriptor.getWelcomeFilesSet());
    }
    addCommonWebBundleDescriptor(webBundleDescriptor);
}