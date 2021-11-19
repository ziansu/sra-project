public hudson.util.FormValidation doCheckMethod(@org.kohsuke.stapler.QueryParameter
java.lang.String method) {
    if (method != "scpb") {
        return hudson.util.FormValidation.error("This method is not supported yet");
    }else {
        return hudson.util.FormValidation.ok();
    }
}