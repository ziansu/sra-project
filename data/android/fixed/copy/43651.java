@java.lang.Override
public void onClick(android.view.View view) {
    com.leosko.todotxt_gdrive.TaskEditDialog ted = new com.leosko.todotxt_gdrive.TaskEditDialog(this, null);
    final android.app.AlertDialog alertD = ted.createTaskCreationDialog();
    alertD.show();
}