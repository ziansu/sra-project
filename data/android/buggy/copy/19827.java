@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "{id}/stavke/{item_id}")
public void deleteInvoiceItemWithID(@javax.ws.rs.PathParam(value = "id")
java.lang.String id, @javax.ws.rs.PathParam(value = "item_id")
java.lang.String item_id) {
    try {
        invoiceDao.removeItemFromInvoice(java.lang.Long.parseLong(id), java.lang.Long.parseLong(item_id));
    } catch (java.lang.Exception e) {
        rs.ac.uns.ftn.xws.services.payments.InvoiceService.log.error(e.getMessage(), e);
    }
}