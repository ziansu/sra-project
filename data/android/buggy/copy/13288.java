@io.swagger.client.api.Multipart
@io.swagger.client.api.POST(value = "pet/{petId}/uploadImage")
retrofit2.Call<io.swagger.client.model.ModelApiResponse> uploadFile(@io.swagger.client.api.Path(value = "petId")
java.lang.Long petId, @io.swagger.client.api.Part(value = "additionalMetadata")
java.lang.String additionalMetadata, @io.swagger.client.api.Part(value = "file\"; filename=\"file\"")
okhttp3.RequestBody file);