public static synchronized taskr.se.taskr.repository.TaskRContentProviderImpl getInstance(android.content.Context context) {
    if ((taskr.se.taskr.repository.TaskRContentProviderImpl.instance) == null) {
        taskr.se.taskr.repository.TaskRContentProviderImpl.instance = new taskr.se.taskr.repository.TaskRContentProviderImpl(context);
    }
    return taskr.se.taskr.repository.TaskRContentProviderImpl.instance;
}