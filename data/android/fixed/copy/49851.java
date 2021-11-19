@retrofit2.http.Multipart
@retrofit2.http.POST(value = "upload/")
@retrofit2.http.Headers(value = { "Accept: application/json" })
retrofit2.Call<java.util.List<com.androidbuts.api.response.Result>> uploadFile(@retrofit2.http.Part
okhttp3.MultipartBody.Part file, @retrofit2.http.Part(value = "description")
okhttp3.RequestBody name);