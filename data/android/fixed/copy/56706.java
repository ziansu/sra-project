@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.dao.EmptyResultDataAccessException.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.core.annotation.Order(value = (org.springframework.core.Ordered.HIGHEST_PRECEDENCE) + 2)
public java.lang.String handleEmptyResultDataAccessException(org.springframework.dao.EmptyResultDataAccessException ex) {
    LOGGER.debug(ex.getMessage());
    return ex.getMessage();
}