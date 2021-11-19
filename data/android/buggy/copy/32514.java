@java.lang.Override
public void undo() {
    grouping.ungroup(groupModule);
    grouping.close();
    controller.remove(groupModule);
}