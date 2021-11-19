@java.lang.Override
public int getProgress(org.apache.zeppelin.interpreter.InterpreterContext context) {
    return (totalCommands) == 0 ? 0 : ((completedCommands) * 100) / (totalCommands);
}