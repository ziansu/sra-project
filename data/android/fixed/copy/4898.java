@org.jbei.ice.services.rest.GET
@org.jbei.ice.services.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response get() {
    java.lang.String userId = requireUserId();
    org.jbei.ice.lib.account.AccountTransfer transfer = accountController.getByEmail(userId).toDataTransferObject();
    transfer.setAdmin(accountController.isAdministrator(userId));
    return super.respond(transfer);
}