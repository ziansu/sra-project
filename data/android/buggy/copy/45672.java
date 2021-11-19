@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    if (valuesChanged) {
        if (isNewNote)
            handleAction(com.codepath.preassignment.todoapp.fragments.dialogs.ToDoListFullScreenDialogFragment.DialogAction.ADD);
        else
            handleAction(com.codepath.preassignment.todoapp.fragments.dialogs.ToDoListFullScreenDialogFragment.DialogAction.EDIT);
        
    }
    dismiss();
}