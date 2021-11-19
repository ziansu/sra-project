@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(MasterDetailOuterFragment.ARG_ITEM_ID)) {
        getLoaderManager().initLoader(nl.adaptivity.process.ui.task.TaskDetailFragment.LOADER_TASKITEM, getArguments(), this);
    }
}