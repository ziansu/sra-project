@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format("Task[id=%d, name=\'%s\', dur=%.2f]", id, parentTask.getTaskName(), ((duration) / (60 * 1000.0)));
}