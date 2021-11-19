@se.hexabit.paxa.rest.GET
@se.hexabit.paxa.rest.Path(value = "/allResources")
@se.hexabit.paxa.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public se.hexabit.paxa.rest.types.Resource[] getAllResources() {
    java.util.List<se.hexabit.paxa.rest.types.Resource> resp = resourcesDao.readAllResources();
    return resp.toArray(new se.hexabit.paxa.rest.types.Resource[resp.size()]);
}