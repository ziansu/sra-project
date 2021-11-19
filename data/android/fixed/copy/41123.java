@com.jersey.resources.DELETE
@com.jersey.resources.Path(value = "{id}")
public void delete(@com.jersey.resources.PathParam(value = "id")
long id) {
    com.jersey.representations.Login login = loginDao.findOne(id);
    if (login == null) {
        throw new com.jersey.resources.WebApplicationException(Response.Status.NOT_FOUND);
    }else {
        loginDao.delete(login);
    }
}