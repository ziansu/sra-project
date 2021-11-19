@java.lang.Override
public hudson.tasks.Publisher newInstance(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.model.Descriptor.FormException {
    org.evosuite.jenkins.recorder.EvoSuiteRecorder pub = new org.evosuite.jenkins.recorder.EvoSuiteRecorder();
    req.bindJSON(pub, formData);
    return pub;
}