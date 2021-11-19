@cz.muni.fi.pa165.rest.controllers.RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public final void update(@cz.muni.fi.pa165.rest.controllers.RequestBody
cz.muni.fi.pa165.dto.UserDTO dto) {
    cz.muni.fi.pa165.rest.controllers.UsersController.logger.info((("REST: updateUser with id '" + (dto.getId())) + "'. "));
    userFacade.update(dto);
}