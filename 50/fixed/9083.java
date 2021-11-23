@retrofit2.http.GET(value = ((com.dataloom.edm.EdmApi.SCHEMA_BASE_PATH) + (com.dataloom.edm.EdmApi.NAMESPACE_PATH)) + (com.dataloom.edm.EdmApi.NAME_PATH))
com.dataloom.edm.Schema getSchemaContentsFormatted(@retrofit2.http.Path(value = com.dataloom.edm.EdmApi.NAMESPACE)
java.lang.String namespace, @retrofit2.http.Path(value = com.dataloom.edm.EdmApi.NAME)
java.lang.String name, @retrofit2.http.Query(value = com.dataloom.edm.EdmApi.FILE_TYPE)
com.dataloom.edm.EdmApi.FileType fileType, @retrofit2.http.Query(value = com.dataloom.edm.EdmApi.TOKEN)
java.lang.String token);