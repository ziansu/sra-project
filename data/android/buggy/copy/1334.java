@retrofit2.http.GET(value = org.openmrs.mobile.data.rest.RestConstants.REST_PATH)
retrofit2.Call<org.openmrs.mobile.models.Results<org.openmrs.mobile.models.ConceptSearchResult>> search(@retrofit2.http.Path(value = "restPath", encoded = true)
java.lang.String restPath, @retrofit2.http.Query(value = "term")
java.lang.String term, @retrofit2.http.Query(value = "startIndex")
java.lang.Integer startIndex, @retrofit2.http.Query(value = "limit")
java.lang.Integer limit);