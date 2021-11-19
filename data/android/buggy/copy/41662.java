public static com.thoughtworks.fam.web.dto.UserDTO getByUserName(java.lang.String userName) {
    for (com.thoughtworks.fam.web.dto.UserDTO user : com.thoughtworks.fam.dao.UserDAO.userCollections) {
        if ((user.getName()) == userName) {
            return user;
        }
    }
    return null;
}