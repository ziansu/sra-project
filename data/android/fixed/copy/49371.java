@java.lang.Override
public void onTaskSetRemoved(nl.tue.san.tasks.TaskSet taskSet) {
    this.notifyDataSetChanged();
}