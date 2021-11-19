public long calculateTotalEffortFromSubTasks(net.sf.memoranda.Task t) {
    if ((t.getSubTasks().size()) > 0) {
        return t.recursivelyModifyEffortFromSubTasks();
    }else {
        return t.getEffort();
    }
}