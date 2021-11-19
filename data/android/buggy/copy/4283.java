@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    ((com.dbl_appdevelopment.group2.todomaster.controller.App) (getApplication())).getTaskManager().getAllTasks().clear();
    startActivity(new android.content.Intent(getMe(), com.dbl_appdevelopment.group2.todomaster.view.StartupActivity.class));
}