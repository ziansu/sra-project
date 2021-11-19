@java.lang.Override
public int getNumItems(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.MultiValueFacetDataCache data = getFacetData(reader);
    if (data == null)
        return 0;
    
    return data.getNumItems(id);
}