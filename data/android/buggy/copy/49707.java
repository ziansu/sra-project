@java.lang.Override
public void ended(uk.co.nickthecoder.jguifier.Task task, boolean normally) {
    if (normally) {
        exit(task.getExitStatus());
    }else {
        exit(uk.co.nickthecoder.jguifier.TaskCommand.EXIT_TASK_FAILED);
    }
}