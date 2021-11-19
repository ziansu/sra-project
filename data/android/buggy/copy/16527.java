@java.lang.Override
public com.ibm.codertalk.beans.User findUserById(java.lang.String userId) {
    com.ibm.codertalk.beans.User user = getUserById(userId);
    if (user != null) {
        user.setPwd(null);
    }
    return user;
}