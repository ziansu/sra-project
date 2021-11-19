@java.lang.Override
public void onTaskSelected(com.codetank.teachingtodolist.data.Task task) {
    replaceFragment(com.codetank.teachingtodolist.screens.TaskFragment.newInstance(task));
}