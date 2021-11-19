@java.lang.Override
public java.lang.String[] getFieldValues(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.MultiValueFacetDataCache dataCache = getFacetData(reader);
    if (dataCache != null) {
        return dataCache._nestedArray.getTranslatedData(id, dataCache.valArray);
    }
    return new java.lang.String[0];
}