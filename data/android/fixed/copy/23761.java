public hudson.util.FormValidation doCheckUrl(@org.kohsuke.stapler.QueryParameter
java.lang.String value) {
    if ((value == null) || ((value.length()) == 0)) {
        return hudson.util.FormValidation.error("Please enter Git repository.");
    }else {
        return hudson.util.FormValidation.ok();
    }
}