public boolean schemeIdContainsAll(eu.europa.ec.fisheries.uvms.rules.service.business.fact.IdType idType, java.lang.String... values) {
    return (idType != null) && (schemeIdContainsAll(java.util.Collections.singletonList(idType), values));
}