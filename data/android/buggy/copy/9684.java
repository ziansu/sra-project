public br.com.moip.resource.Invoice get(final java.lang.String id) {
    br.com.moip.resource.Invoice invoice = client.get(("/v2/invoices/" + id), br.com.moip.resource.Invoice.class);
    return invoice;
}