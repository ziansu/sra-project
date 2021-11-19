@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    taskId = ((java.util.UUID) (getIntent().getSerializableExtra(com.codepath.preassignment.todoapp.activity.ToDoListActivity.EXTRA_TASK_ID)));
    if ((taskId) != null) {
        return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance(taskId);
    }
    return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance();
}