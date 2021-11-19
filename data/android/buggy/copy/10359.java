public com.wfx.autorunner.core.TaskEntry getNextTaskEntry() {
    return ((count)++) < (totalCount) ? new com.wfx.autorunner.core.TaskEntry(name, script, totalCount) : null;
}