@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = "v1.0/")
retrofit2.Call<io.caly.calyandroid.Model.Response.BasicResponse> test(@retrofit2.http.Field(value = "key")
java.lang.String key);