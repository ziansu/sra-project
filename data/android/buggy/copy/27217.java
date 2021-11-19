public java.util.List<edu.msg.ro.business.dto.UserDTO> getAllUsers() throws edu.msg.ro.business.exception.TechnicalException {
    java.util.List<edu.msg.ro.persistence.entity.User> allUsers = userDAO.getAllUsers();
    return userDTOMapper.mapToDTOs(allUsers);
}