private hudson.EnvVars getEnvVars() throws java.io.IOException, java.lang.InterruptedException {
    return new hudson.EnvVars(build.getEnvironment(listener)).overrideAll(dockerEnv.env());
}