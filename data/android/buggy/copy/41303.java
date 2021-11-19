@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
public T create(@org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
T entity, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    beforeSave(entity);
    return getService().saveAndFlush(entity);
}