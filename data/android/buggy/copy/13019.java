@java.lang.Override
public java.util.List<edu.cursor.library.user.entity.TblUser> getUserList() {
    java.util.Collections.addAll(edu.cursor.library.user.service.UserServiceImpl.userList, edu.cursor.library.user.utils.IOCsv.readFile(path));
    return edu.cursor.library.user.service.UserServiceImpl.userList;
}