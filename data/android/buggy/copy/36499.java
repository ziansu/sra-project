@java.lang.Override
protected java.util.List<com.artursworld.nccn.model.entity.User> doInBackground(java.lang.Void... voids) {
    if ((allUsers.size()) <= 0)
        return new com.artursworld.nccn.model.persistence.manager.UserManager().getAllUsers();
    
    return allUsers;
}