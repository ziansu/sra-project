public java.util.List<edu.msg.ro.business.dto.UserDTO> getAllUsers() throws edu.msg.ro.business.exception.TechnicalException {
    return userDTOMapper.mapToDTOs(userDAO.getAllUsers());
}