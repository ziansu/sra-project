@java.lang.Override
public void onTaskSelected(com.codetank.teachingtodolist.data.Task task) {
    replaceFragment(new com.codetank.teachingtodolist.screens.TaskFragment().newInstance(task));
}