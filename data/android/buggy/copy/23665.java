public static flexagon.fd.plugin.jenkins.utils.Credential fromStapler(@org.kohsuke.stapler.QueryParameter
java.lang.String name, @org.kohsuke.stapler.QueryParameter
java.lang.String username, @org.kohsuke.stapler.QueryParameter
hudson.util.Secret password, @org.kohsuke.stapler.QueryParameter
java.lang.String flexDeployServerUrl, @org.kohsuke.stapler.QueryParameter
java.lang.String credentialsId, @org.kohsuke.stapler.QueryParameter
boolean useGlobalCredential) {
    return new flexagon.fd.plugin.jenkins.utils.Credential(name, username, password, credentialsId, useGlobalCredential);
}