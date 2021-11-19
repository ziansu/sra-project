@de.fau.cs.mad.kwikshop.common.rest.GET
@de.fau.cs.mad.kwikshop.common.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@de.fau.cs.mad.kwikshop.common.rest.Path(value = "{listId}")
@io.dropwizard.hibernate.UnitOfWork
de.fau.cs.mad.kwikshop.common.ShoppingListServer getList(@io.dropwizard.auth.Auth
de.fau.cs.mad.kwikshop.common.User user, @de.fau.cs.mad.kwikshop.common.rest.PathParam(value = "listId")
int listId);