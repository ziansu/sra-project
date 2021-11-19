@java.lang.Override
public void process(org.apache.commons.cli.CommandLine cmd) {
    if (cmd.hasOption("chunkSize")) {
        coordinatorService.setChunkSize(java.lang.Integer.valueOf(cmd.getOptionValue("chunkSize")));
    }
    coordinatorService.startServer();
}