@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{id}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public double allIngredientsSnack(@javax.ws.rs.PathParam(value = "id")
int id) {
    com.vstevam.gigabyte.service.MenuService menuService = new com.vstevam.gigabyte.service.MenuService();
    return menuService.snackPrice(id);
}