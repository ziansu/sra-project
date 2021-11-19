public java.util.List<com.findyourmatch.entities.UserEntity> getListUser() {
    this.listUser = ejbFacade.findRecentUsers();
    return listUser;
}