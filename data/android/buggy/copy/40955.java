public java.lang.String update(model.User userPar) {
    selectedUser = userPar;
    listSelectedUser();
    return "updateUser.xhtml";
}