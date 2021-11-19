@java.lang.Override
public void onCommandResult(int commandCode, int exitCode, java.util.List<java.lang.String> output) {
    if (exitCode != (OnResult.SHELL_RUNNING))
        showRootFailDialog();
    
}