public static org.apache.commons.exec.CommandLine createCommand(java.lang.String... args) {
    org.apache.commons.exec.CommandLine gitCmd = new org.apache.commons.exec.CommandLine("git");
    gitCmd.addArguments(args);
    return gitCmd;
}