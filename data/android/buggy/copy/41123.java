@com.jersey.resources.GET
@com.jersey.resources.Path(value = "{id}")
public com.jersey.representations.Login getLogin(@com.jersey.resources.PathParam(value = "id")
long id) {
    com.jersey.representations.Login login = loginDao.findOne(id);
    if (login == null) {
        throw new com.jersey.resources.WebApplicationException(Response.Status.NOT_FOUND);
    }
    return login;
}