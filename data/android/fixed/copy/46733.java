public java.lang.String getBuildServerUrl() {
    if (((buildServerUrl) == null) || (buildServerUrl.equals(""))) {
        jenkins.model.JenkinsLocationConfiguration jenkinsConfig = new jenkins.model.JenkinsLocationConfiguration();
        return jenkinsConfig.getUrl();
    }else {
        return buildServerUrl;
    }
}