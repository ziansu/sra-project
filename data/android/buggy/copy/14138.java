@org.springframework.web.bind.annotation.RequestMapping(value = "/admin", method = org.springframework.web.bind.annotation.RequestMethod.GET, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public final boolean isAdmin(cz.muni.fi.pa165.dto.UserDTO dto) {
    cz.muni.fi.pa165.rest.controllers.UsersController.logger.info((("REST: updateUser with id '" + (dto.getId())) + "'. "));
    return userFacade.isAdmin(dto.getId());
}