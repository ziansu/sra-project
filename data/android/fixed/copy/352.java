public static java.lang.Integer runCli(java.util.List<java.lang.String> args, java.lang.String workingDir) throws java.lang.Exception {
    java.util.Properties testProperties = org.commonjava.maven.ext.manip.CliTestUtils.loadTestProps(workingDir);
    return org.commonjava.maven.ext.manip.CliTestUtils.runCli(args, testProperties, workingDir);
}