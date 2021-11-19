@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    verifyAppEngineStandardApp();
    workAroundNonJava7Version();
    getAppEngineFactory().devServerRunSync().run(this);
}