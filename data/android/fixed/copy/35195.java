private void checkSshNodesSSHOptions(com.griddynamics.jagger.jenkins.plugin.Build build, com.griddynamics.jagger.jenkins.plugin.BuildListener listener, com.griddynamics.jagger.jenkins.plugin.SshNode node) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String temp = node.getSshOptions();
    node.setSshOptionsActual(build.getEnvironment(listener).expand(temp));
}