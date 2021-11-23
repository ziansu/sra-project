public com.fh.entity.system.User getUserAndRoleById(int USER_ID) throws java.lang.Exception {
    return ((com.fh.entity.system.User) (dao.findForObject("UserMapper.getUserAndRoleById", USER_ID)));
}