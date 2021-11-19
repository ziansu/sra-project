@java.lang.Override
public org.killbill.billing.catalog.api.StaticCatalog getCurrentCatalog(final boolean useDefaultCatalog, final org.killbill.billing.callcontext.InternalTenantContext context) throws org.killbill.billing.catalog.api.CatalogApiException {
    return getCatalog(useDefaultCatalog, context);
}