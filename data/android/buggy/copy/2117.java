@java.lang.Override
public hudson.tasks.Mailer.UserProperty newInstance(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.tasks.FormException {
    return new hudson.tasks.Mailer.UserProperty(req.getParameter("email.address"));
}