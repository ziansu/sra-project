public java.lang.String addNewGroup(com.example.admin.myapplication.model.entities.Group group) {
    addNewGroupToLocal(group);
    java.lang.String newGroupKey = com.example.admin.myapplication.controller.database.remote.GroupsDB.getInstance().addNewGroup(group);
    return newGroupKey;
}