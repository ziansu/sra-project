@java.lang.Override
public void notify(java.lang.Object o) {
    if (o instanceof common.IAttribute) {
        common.IAttribute attr = ((common.IAttribute) (o));
        addNewTask(attr);
    }
}