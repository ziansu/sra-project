@io.swagger.client.api.DELETE(value = "pet/{petId}")
retrofit2.Call<java.lang.Void> deletePet(@io.swagger.client.api.Path(value = "petId")
java.lang.Long petId, @io.swagger.client.api.Header(value = "api_key")
java.lang.String apiKey);