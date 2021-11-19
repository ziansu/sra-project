@java.lang.Override
public boolean execute() {
    try {
        command.execute();
    } catch (java.lang.Exception e) {
        gwtLogger.warn(e.getMessage(), e);
    }
    return true;
}