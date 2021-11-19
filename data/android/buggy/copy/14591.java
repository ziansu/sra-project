@java.lang.Override
public int getNumItems(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.MultiValueFacetDataCache data = getFacetData(reader);
    return data.getNumItems(id);
}