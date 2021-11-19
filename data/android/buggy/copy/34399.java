void onDestroy() {
    for (com.android_project.grocery.controller.database.models.GroupMembersModel model : groupMembersModels) {
        model.destroy();
    }
}