public br.com.moip.resource.Invoice list() {
    br.com.moip.resource.Invoice createdInvoice = client.get("/v2/invoices", br.com.moip.resource.Invoice.class);
    return createdInvoice;
}