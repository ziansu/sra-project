@java.lang.Override
public void deleteOnExit() {
    deleteWorkspaceContent(this);
    delete();
}