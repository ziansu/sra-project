@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.dao.DataAccessException.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String handleDataAccessException(org.springframework.dao.DataAccessException ex) {
    com.epam.rest.RestErrorHandler.LOGGER.debug(("Handling DataAccessException: " + ex));
    return "DataAccessException: " + (ex.getLocalizedMessage());
}