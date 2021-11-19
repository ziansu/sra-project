@java.lang.Override
public void notify(java.lang.Object o) {
    if ((o.getClass()) == (common.IAttribute.class)) {
        common.IAttribute attr = ((common.IAttribute) (o));
        addNewTask(attr);
    }
}