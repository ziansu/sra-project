@java.lang.Override
public hudson.tasks.Publisher newInstance(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.model.Descriptor.FormException {
    return ((org.evosuite.jenkins.recorder.EvoSuiteRecorder) (super.newInstance(req, formData)));
}