private void npmCommand(java.lang.String args, java.util.Map<java.lang.String, java.lang.String> env) throws org.apache.zeppelin.helium.TaskRunnerException {
    org.apache.zeppelin.helium.NpmRunner npm = frontEndPluginFactory.getNpmRunner(getProxyConfig(), defaultNpmRegistryUrl);
    npm.execute(args, env);
}