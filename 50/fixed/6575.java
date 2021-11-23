public static com.stericson.RootShell.execution.Command runRootCommand(com.stericson.RootShell.execution.Command command) throws com.stericson.RootShell.exceptions.RootDeniedException, java.io.IOException, java.util.concurrent.TimeoutException {
    return com.stericson.RootShell.execution.Shell.startRootShell().add(command);
}