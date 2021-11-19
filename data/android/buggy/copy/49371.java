@java.lang.Override
public void onTaskSetRemoved(nl.tue.san.tasks.TaskSet taskSet) {
    nl.tue.san.ui.Log.d("TaskSetFragment.Adapter", ("Called onTaskSetRemoved: " + (taskSet.getName())));
    this.notifyDataSetChanged();
}