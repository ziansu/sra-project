protected java.lang.String serialiseToJSON(java.util.Collection<java.lang.String> list) throws java.io.IOException, org.codehaus.jackson.JsonParseException, org.codehaus.jackson.map.JsonMappingException {
    if (list == null)
        return null;
    
    return amberdb.model.Work.Impl.mapper.writeValueAsString(list);
}