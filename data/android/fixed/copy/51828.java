@java.lang.Override
public org.jenkinsci.plugins.pretestedintegration.IntegrationStrategy newInstance(org.kohsuke.stapler.StaplerRequest staplerRequest, net.sf.json.JSONObject formData) throws org.jenkinsci.plugins.pretestedintegration.FormException {
    if (staplerRequest != null) {
        staplerRequest.bindJSON(org.jenkinsci.plugins.pretestedintegration.IntegrationStrategy.class, formData);
    }
    return null;
}