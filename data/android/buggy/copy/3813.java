public java.util.List<com.findyourmatch.entities.UserEntity> getListUser() {
    if (this.listUser.isEmpty()) {
        this.listUser = ejbFacade.findRecentUsers();
    }
    return listUser;
}