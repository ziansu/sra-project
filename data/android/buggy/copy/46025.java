public void updateAfterSingIn(net.brainas.android.app.infrustructure.UserAccount userAccount) {
    tasksManager = new net.brainas.android.app.domain.helpers.TasksManager(taskDbHelper, accountsManager.getCurrentAccountId());
}