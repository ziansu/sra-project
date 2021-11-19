public <T extends org.apache.isis.core.metamodel.facetapi.Facet> T getFacet(final java.lang.Class<T> facetType) {
    final org.apache.isis.core.metamodel.facetapi.FacetHolder facetHolder = getActionMemento().getAction(getSpecificationLoader());
    return facetHolder.getFacet(facetType);
}