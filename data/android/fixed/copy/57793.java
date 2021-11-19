public com.google.android.gms.tasks.Task<java.lang.Void> send(android.content.Context context) {
    try {
        return project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this);
    } finally {
        project.sherpa.utilities.ContentProviderUtils.insertModel(context, this);
    }
}