@java.lang.Override
public boolean onLongClick(android.view.View v) {
    deleteProject(relativePosition, section);
    return false;
}