protected static org.jenkinsci.plugins.workflow.steps.StringCredentials lookupCredentials(@javax.annotation.Nonnull
java.lang.String credentialId) {
    return com.cloudbees.plugins.credentials.CredentialsMatchers.firstOrNull(com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(org.jenkinsci.plugins.workflow.steps.StringCredentials.class, jenkins.model.Jenkins.getInstance(), ACL.SYSTEM), com.cloudbees.plugins.credentials.CredentialsMatchers.withId(credentialId));
}