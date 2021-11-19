@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mTasks = com.infiniteloop.mytasks.TaskLab.get().getTasks();
}