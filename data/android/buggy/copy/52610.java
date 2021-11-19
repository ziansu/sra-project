@java.lang.Override
public void onBindViewHolder(cbstudios.coffeebreak.view.adapter.TaskAdapter.TaskViewHolder viewHolder, final int position) {
    cbstudios.coffeebreak.model.tododatamodule.todolist.IAdvancedTask task = mTasks.get(position);
    viewHolder.task = mTasks.get(position);
    setUpTask(viewHolder, task);
}